package cn.mrain22.qa.modules.service;

import cn.mrain22.qa.modules.dao.ProblemDao;
import cn.mrain22.qa.modules.entity.Problem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * 问题(TbProblem)表服务接口
 *
 * @author Xiuming Lee
 * @since 2019-06-13 13:56:40
 */
@Service
@Transactional(rollbackOn=Exception.class)
public class ProblemService {
    @Autowired
    private ProblemDao problemDao;

    /**
     * 根据标签ID查询问题列表
     * @param lableId
     * @param page
     * @param size
     * @return
     */
    public Page<Problem> findNewListByLabelId(String lableId, int page, int size) {
        PageRequest pageRequest = PageRequest.of(page-1, size);
        return problemDao.findNewListByLabelId(lableId,pageRequest);
    }

    /**
     * 根据标签ID查询热门问题列表
     * @param lableId
     * @param page
     * @param size
     * @return
     */
    public Page<Problem> findHotListByLabelId(String lableId,int page, int size) {
        PageRequest pageRequest = PageRequest.of(page-1, size);
        return problemDao.findHotListByLabelId(lableId,pageRequest);
    }

    /**
     * 根据标签ID查询等待回答列表
     * @param lableId
     * @param page
     * @param size
     * @return
     */
    public Page<Problem> findWaitListByLabelId(String lableId,int page,int size) {
        PageRequest pageRequest = PageRequest.of(page-1, size);
        return problemDao.findWaitListByLabelId(lableId,pageRequest);
    }

}