package cn.mrain22.article.modules.controller;

import cn.mrain22.article.modules.service.ArticleService;
import cn.mrain22.common.entity.ServerResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: Xiuming Lee
 * @Date: 2019/6/13 15:32
 * @Version 1.0
 * @Describe:
 */
@RestController
@RequestMapping("/article")
public class ArticleController {
    @Resource
    private ArticleService articleService;

    /**
     * 审核
     * @param id
     * @return
     */
    @PutMapping(value="/examine/{id}")
    public ServerResult examine(@PathVariable String id){
        articleService.examine(id);
        return ServerResult.createBySuccessMessage("审核成功");
    }

    /**
     * 点赞
     * @param id 文章id
     * @return
     */
    @PutMapping(value="/thumbup/{id}")
    public ServerResult updateThumbup(@PathVariable String id){
        articleService.updateThumbup(id);
        return ServerResult.createBySuccessMessage("点赞成功");
    }
}
