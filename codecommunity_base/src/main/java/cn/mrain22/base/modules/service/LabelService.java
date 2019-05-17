package cn.mrain22.base.modules.service;

import cn.mrain22.base.modules.dao.LabelDao;
import cn.mrain22.base.modules.entity.Label;
import cn.mrain22.common.util.IdWorker;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Xiuming Lee
 * @Date: 2019/5/16 8:16
 * @Version 1.0
 * @Describe: 标签业务逻辑类
 */
@Service
@Transactional
public class LabelService {
    @Autowired
    private LabelDao labelDao;
    @Autowired
    private IdWorker idWorker;

    /**
     * 查询所有标签
     *
     * @return
     */
    public List<Label> findAll() {
        return labelDao.findAll();
    }

    /**
     * 根据标签ID查询
     *
     * @param id 标签id
     * @return
     */
    public Label findById(String id) {
        return labelDao.findById(id).get();
    }

    /**
     * 添加标签
     *
     * @param label
     */
    public void add(Label label) {
        //设置ID，将long类型装换成string类型
        label.setId(idWorker.nextId() + "");
        labelDao.save(label);
    }

    /**
     * 修改标签
     *
     * @param label
     */
    public void update(Label label) {
        labelDao.save(label);
    }

    /**
     * 删除标签
     *
     * @param id
     */
    public void deleteById(String id) {
        labelDao.deleteById(id);
    }


    /**
     * 标签条件查询
     * @param label
     * @return
     */
    public List<Label> findSearch(Label label){
        //构建查询条件
        Specification specification= createSpecification(label);
        return labelDao.findAll( specification);
    }
    public Page<Label> findSearch(Label label, int page, int size){
        //构建查询条件
        Specification specification= createSpecification(label);
        //设置分页
        PageRequest pageRequest=PageRequest.of(page-1,size);
        return labelDao.findAll(specification ,pageRequest);
    }
    /**
     * 构建条件查询
     *
     * @param label
     * @return
     */
    private Specification<Label> createSpecification(Label label) {
        return new Specification<Label>() {
            @Override
            public Predicate toPredicate(Root<Label> root, CriteriaQuery<?>
                    criteriaQuery, CriteriaBuilder cb) {
                //用list存储所有条件
                List<Predicate> predicateList = new ArrayList<>();
                if (StringUtils.isNoneBlank(label.getLabelname())) {
                    //where labelname like 'xxx'
                    Predicate labelname = cb.like(root.get("labelname").as(String.class), "%" + label.getLabelname() + "%");
                    predicateList.add(labelname);
                }
                if (StringUtils.isNoneBlank(label.getState())) {
                    // state = 'y'
                    predicateList.add(cb.equal(root.get("state").as(String.class), label.getState()));
                }
                if (StringUtils.isNoneBlank(label.getRecommend())) {
                    // recommend = 'z'
                    predicateList.add(cb.equal(root.get("recommend").as(String.class), label.getRecommend()));
                }
                //将list转换成Predicate[]数组
                Predicate[] predicates = predicateList.toArray(new Predicate[predicateList.size()]);
                return cb.and(predicates);
            }
        };
    }


}
