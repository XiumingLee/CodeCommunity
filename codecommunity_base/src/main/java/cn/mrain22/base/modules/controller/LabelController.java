package cn.mrain22.base.modules.controller;

import cn.mrain22.base.modules.entity.Label;
import cn.mrain22.base.modules.service.LabelService;
import cn.mrain22.common.entity.PageResult;
import cn.mrain22.common.entity.ServerResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @Author: Xiuming Lee
 * @Date: 2019/5/16 8:19
 * @Version 1.0
 * @Describe: 标签控制层
 */
@RestController
@RequestMapping("/label")
public class LabelController {
    @Autowired
    private LabelService labelService;

    /**
     * 查询所有标签
     * @return
     */
    @GetMapping
    public ServerResult<List> findAll(){
        return ServerResult.createBySuccess("查询成功",labelService.findAll());
    }

    /**
     * 根据id查询标签
     * @param id
     * @return
     */
    @GetMapping(value="/{id}")
    public ServerResult<Label> findById(@PathVariable String id){
        return ServerResult.createBySuccess("查询成功",labelService.findById(id));
    }

    /**
     * 添加标签
     * @param label
     * @return
     */
    @PostMapping
    public ServerResult add(Label label){
        labelService.add(label);
        return ServerResult.createBySuccessMessage("添加成功");
    }

    /**
     * 修改标签
     * @param label
     * @param id
     * @return
     */
    @PutMapping(value="/{id}")
    public ServerResult update(Label label,@PathVariable String id){
        label.setId(id);
        labelService.update(label);
        return ServerResult.createBySuccessMessage("修改成功");
    }

    /**
     * 删除标签
     * @param id
     * @return
     */
    @DeleteMapping(value="/{id}")
    public ServerResult deleteById(@PathVariable String id){
        labelService.deleteById(id);
        return ServerResult.createBySuccessMessage("删除成功");
    }

    /**
     * 根据条件查询相关标签
     * @param searchMap
     * @return
     */
    @GetMapping(value="/search")
    public ServerResult<List> findSearch(Map searchMap){
        return ServerResult.createBySuccess("查询成功",labelService.findSearch(searchMap));
    }

    /**
     * 根据条件分页查询
     * @param searchMap
     * @param page
     * @param size
     * @return
     */
    @PostMapping(value="/search/{page}/{size}")
    public ServerResult findSearch(Map searchMap,@PathVariable int page,@PathVariable int size ){
        Page pageList= labelService.findSearch(searchMap,page,size);
        return ServerResult.createBySuccess("查询成功",PageResult.of(pageList.getTotalElements(),pageList.getTotalPages(),pageList.getContent()));
    }

}
