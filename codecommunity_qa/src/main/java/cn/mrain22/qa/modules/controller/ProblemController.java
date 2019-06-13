package cn.mrain22.qa.modules.controller;

import cn.mrain22.common.entity.PageResult;
import cn.mrain22.common.entity.ServerResult;
import cn.mrain22.qa.modules.entity.Problem;
import cn.mrain22.qa.modules.service.ProblemService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 问题(TbProblem)表控制层
 *
 * @author Xiuming Lee
 * @since 2019-06-13 13:56:41
 */
@RestController
@RequestMapping("problem")
public class ProblemController {
    /**
     * 服务对象
     */
    @Resource
    private ProblemService problemService;

    @GetMapping(value="/newlist/{labelid}/{page}/{size}")
    public ServerResult findNewListByLabelId(@PathVariable String labelid, @PathVariable int page, @PathVariable int size ){
        Page<Problem> pageList = problemService.findNewListByLabelId(labelid, page, size);
        PageResult<Problem> pageResult = PageResult.of(pageList.getTotalElements(),pageList.getTotalPages(),pageList.getContent());
        return ServerResult.createBySuccess("查询成功！",pageResult);
    }

    @GetMapping(value="/hotlist/{labelid}/{page}/{size}")
    public ServerResult findHotListByLabelId(@PathVariable String labelid,@PathVariable int page,@PathVariable int size ){
        Page<Problem> pageList = problemService.findHotListByLabelId(labelid, page, size);
        PageResult<Problem> pageResult = PageResult.of(pageList.getTotalElements(),pageList.getTotalPages(), pageList.getContent());
        return ServerResult.createBySuccess("查询成功",pageResult);
    }

    /**
     * 根据标签ID查询等待回答列表
     * @param labelid
     * @param page
     * @param size
     * @return
     */
    @GetMapping(value="/waitlist/{labelid}/{page}/{size}")
    public ServerResult findWaitListByLabelId(@PathVariable String labelid,@PathVariable int page,@PathVariable int size ){
        Page<Problem> pageList = problemService.findWaitListByLabelId(labelid, page, size);;
        return ServerResult.createBySuccess("查询成功",pageList);
    }


}