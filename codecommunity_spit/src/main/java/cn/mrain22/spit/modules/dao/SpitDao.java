package cn.mrain22.spit.modules.dao;

import cn.mrain22.spit.modules.entity.Spit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @Author: Xiuming Lee
 * @Date: 2019/6/20 20:02
 * @Version 1.0
 * @Describe: 吐槽数据访问层
 */
public interface SpitDao extends MongoRepository<Spit, String> {

    /**
     * 根据上级ID查询吐槽列表（分页）
     * @param parentid
     * @param pageable
     * @return
     */
    public Page<Spit> findByParentid(String parentid, Pageable pageable);
}
