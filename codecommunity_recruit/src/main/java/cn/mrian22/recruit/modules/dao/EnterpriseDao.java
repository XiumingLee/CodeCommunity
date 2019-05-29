package cn.mrian22.recruit.modules.dao;

import cn.mrian22.recruit.modules.entity.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * @Author: Xiuming Lee
 * @Date: 2019/5/20 9:18
 * @Version 1.0
 * @Describe: 企业Dao层
 */
public interface EnterpriseDao extends JpaRepository<Enterprise,String>,JpaSpecificationExecutor<Enterprise> {
    /**
     * 根据热门状态获取企业列表
     * @param hot
     * @return
     */
    public List<Enterprise> findByHot(String hot);
}
