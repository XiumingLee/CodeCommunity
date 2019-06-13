package cn.mrain22.recruit.modules.service;

import cn.mrain22.recruit.modules.dao.EnterpriseDao;
import cn.mrain22.recruit.modules.entity.Enterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @Author: Xiuming Lee
 * @Date: 2019/5/20 9:22
 * @Version 1.0
 * @Describe:
 */
@Service
@Transactional(rollbackOn=Exception.class)
public class EnterpriseService {
    @Autowired
    private EnterpriseDao enterpriseDao;

    /**
     * 热门企业列表
     * @return
     */
    public List<Enterprise> listHostEnterprise(){
        return enterpriseDao.findByHot("1");
    }
}
