package cn.mrain22.qa.modules.service;

import cn.mrain22.qa.modules.dao.PlDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * (TbPl)表服务接口
 *
 * @author Xiuming Lee
 * @since 2019-06-13 13:57:21
 */
@Service
@Transactional(rollbackOn=Exception.class)
public class PlService{
    @Autowired
    private PlDao plDao;

}