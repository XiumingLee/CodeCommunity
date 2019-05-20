package cn.mrian22.recruit.modules.controller;

import cn.mrain22.common.entity.ServerResult;
import cn.mrian22.recruit.modules.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Xiuming Lee
 * @Date: 2019/5/20 9:26
 * @Version 1.0
 * @Describe:
 */
@RestController
@RequestMapping("/recruit")
public class EnterpriseController {
    @Autowired
    private EnterpriseService enterpriseService;

    /**
     * 根据热门状态获取企业列表
     * @return
     */
    @GetMapping("/enterprise/listhost")
    public ServerResult listHostEnterprise() {
        return ServerResult.createBySuccess("查询成功", enterpriseService.listHostEnterprise());
    }
}
