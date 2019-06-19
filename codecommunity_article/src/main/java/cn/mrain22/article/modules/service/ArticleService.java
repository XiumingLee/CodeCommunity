package cn.mrain22.article.modules.service;

import cn.mrain22.article.modules.dao.ArticleDao;
import cn.mrain22.article.modules.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @Author: Xiuming Lee
 * @Date: 2019/6/13 15:30
 * @Version 1.0
 * @Describe:
 */
@Service
@Transactional(rollbackOn=Exception.class)
public class ArticleService {

    @Autowired
    private ArticleDao articleDao;

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 文章审核
     * @param id
     */
    public void examine(String id){
        articleDao.examine(id);
    }

    /**
     * 点赞
     * @param id 文章id
     * @return
     */
    public int updateThumbup(String id){
        return articleDao.updateThumbup(id);
    }

    /**
     *  根据ID查询实体
     * @param id
     * @return
     */
    public Article findById(String id) {
        //从缓存中提取
        Article article = (Article)redisTemplate.opsForValue().get("article_"+id);
        // 如果缓存没有则到数据库查询并放入缓存
        if(article==null) {
            article = articleDao.findById(id).get();
            redisTemplate.opsForValue().set("article_" + id, article);
        }
        return article;
    }
}
