package cn.mrian22.recruit.modules.service;

import cn.mrian22.recruit.modules.dao.RecruitDao;
import cn.mrian22.recruit.modules.entity.Recruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @Author: Xiuming Lee
 * @Date: 2019/5/27 8:51
 * @Version 1.0
 * @Describe:
 */
@Service
@Transactional(rollbackOn=Exception.class)
public class RecruitService {

    @Autowired
    private RecruitDao recruitDao;

    /**
     * 根据状态查询
     * @param state 状态(0：关闭 1:开启 2：推荐)
     * @return
     */
    public List<Recruit> findTop4ByStateOrderByCreatetimeDesc(String state){
        return recruitDao.findTop4ByStateOrderByCreatetimeDesc(state);
    }
}
