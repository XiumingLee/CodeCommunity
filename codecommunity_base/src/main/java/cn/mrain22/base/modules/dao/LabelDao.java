package cn.mrain22.base.modules.dao;

import cn.mrain22.base.modules.entity.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @Author: Xiuming Lee
 * @Date: 2019/5/16 8:10
 * @Version 1.0
 * @Describe: 标签数据访问接口
 * JpaRepository提供了基本的增删改查
 * JpaSpecificationExecutor用于做复杂的条件查询
 */
public interface LabelDao extends JpaRepository<Label,String>,JpaSpecificationExecutor<Label> {

}
