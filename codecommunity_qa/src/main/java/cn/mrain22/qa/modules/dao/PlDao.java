package cn.mrain22.qa.modules.dao;

import cn.mrain22.qa.modules.entity.Pl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @Author: Xiuming Lee
 * @Date: 2019/6/13 14:02
 * @Version 1.0
 * @Describe:
 */
public interface PlDao extends JpaRepository<Pl,String>,JpaSpecificationExecutor<Pl> {
}
