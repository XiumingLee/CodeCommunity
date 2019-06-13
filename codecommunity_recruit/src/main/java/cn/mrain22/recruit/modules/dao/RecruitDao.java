package cn.mrain22.recruit.modules.dao;

import cn.mrain22.recruit.modules.entity.Recruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * @Author: Xiuming Lee
 * @Date: 2019/5/27 8:30
 * @Version 1.0
 * @Describe: 职位Dao层
 */
public interface RecruitDao extends JpaRepository<Recruit,String>,JpaSpecificationExecutor<Recruit> {
    /**
     * 推荐职位前四条
     * 查询状态为2并以创建日期降序排序，查询前4条记录
     * @param state 状态(0：关闭 1:开启 2：推荐)
     * @return
     */
    public List<Recruit> findTop4ByStateOrderByCreatetimeDesc(String state);
}
