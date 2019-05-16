package cn.mrain22.base.modules.service;

import cn.mrain22.base.modules.dao.LabelDao;
import cn.mrain22.base.modules.entity.Label;
import cn.mrain22.common.util.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Xiuming Lee
 * @Date: 2019/5/16 8:16
 * @Version 1.0
 * @Describe: 标签业务逻辑类
 */
@Service
public class LabelService {
    @Autowired
    private LabelDao labelDao;
    @Autowired
    private IdWorker idWorker;

    /**
     * 查询所有标签
     * @return
     */
    public List<Label> findAll(){
        return labelDao.findAll();
    }

    /**
     *根据标签ID查询
     * @param id 标签id
     * @return
     */
    public Label findById(String id){
        return labelDao.findById(id).get();
    }

    /**
     * 添加标签
     * @param label
     */
    public void add(Label label){
        //设置ID，将long类型装换成string类型
        label.setId( idWorker.nextId()+"" );
        labelDao.save(label);
    }

    /**
     * 修改标签
     * @param label
     */
    public void update(Label label){
        labelDao.save(label);
    }

    /**
     * 删除标签
     * @param id
     */
    public void deleteById(String id){
        labelDao.deleteById(id);
    }


}
