package cn.mrain22.spit.modules.controller;

import cn.mrain22.common.entity.PageResult;
import cn.mrain22.common.entity.ServerResult;
import cn.mrain22.spit.modules.entity.Spit;
import cn.mrain22.spit.modules.service.SpitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Xiuming Lee
 * @Date: 2019/6/20 20:07
 * @Version 1.0
 * @Describe:
 */
@RestController
@CrossOrigin
@RequestMapping("/spit")
public class SpitController {
    @Autowired
    private SpitService spitService;

    /**
     * 查询全部数据
     * @return
     */
    @GetMapping
    public ServerResult findAll(){
        return ServerResult.createBySuccess("查询成功！",spitService.findAll());
    }
    /**
     * 根据ID查询
     * @param id ID
     * @return
     */
    @GetMapping(value="/{id}")
    public ServerResult findOne(@PathVariable String id){
        return ServerResult.createBySuccess("查询成功！",spitService.findById(id));
    }

    /**
     * 增加
     * @param spit
     */
    @PostMapping
    public ServerResult add(@RequestBody Spit spit ){
        spitService.add(spit);
        return ServerResult.createBySuccessMessage("新增成功！");
    }

    /**
     * 修改
     * @param spit
     * @param id
     * @return
     */
    @RequestMapping(value="/{id}",method=RequestMethod.PUT)
    public ServerResult update(@RequestBody Spit spit,@PathVariable String id )
    {
        spit.set_id(id);
        spitService.update(spit);
        return ServerResult.createBySuccessMessage("修改成功！");
    }

    /**
     * 删除
     * @param id
     */
    @RequestMapping(value="/{id}",method=RequestMethod.DELETE)
    public ServerResult deleteById(@PathVariable String id ){
        spitService.deleteById(id);
        return ServerResult.createBySuccessMessage("删除成功！");
    }


    /**
     * 根据上级ID查询吐槽分页数据
     * @param page
     * @param size
     * @return
     */
    @GetMapping(value="/comment/{parentId}/{page}/{size}")
    public ServerResult findByParentid(@PathVariable String parentId,@PathVariable int page,@PathVariable int size){
        Page<Spit> pageList = spitService.findByParentid(parentId,page, size);
        return ServerResult.createBySuccess("查询成功！",PageResult.of(pageList.getTotalElements(),pageList.getTotalPages(),pageList.getContent()));
    }

    /**
     * 点赞 == 控制不能重复点赞。或者再点一次取消点赞。引入redis。如果不引入redis，也可以新建一张表，记录那些id对该文章点过赞
     * @param id
     * @return
     */
    @Autowired
    private RedisTemplate redisTemplate;

    @PutMapping(value="/thumbup/{id}")
    public ServerResult updateThumbup(@PathVariable String id){
        //判断用户是否点过赞
        String userid="2023";// 后边我们会修改为当前登陆的用户
        if(redisTemplate.opsForValue().get("thumbup_"+userid+"_"+ id)!=null){
            return ServerResult.createBySuccessMessage("你已经点过赞了！");
        }
        spitService.updateThumbup(id);
        redisTemplate.opsForValue().set( "thumbup_"+userid+"_"+ id,"1");
        return ServerResult.createBySuccessMessage("点赞成功！");
    }

}
