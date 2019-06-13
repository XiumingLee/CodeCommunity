package cn.mrain22.qa.modules.controller;

import cn.mrain22.qa.modules.service.PlService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (TbPl)表控制层
 *
 * @author Xiuming Lee
 * @since 2019-06-13 13:57:21
 */
@RestController
@RequestMapping("pl")
public class PlController {
    /**
     * 服务对象
     */
    @Resource
    private PlService tbPlService;



}