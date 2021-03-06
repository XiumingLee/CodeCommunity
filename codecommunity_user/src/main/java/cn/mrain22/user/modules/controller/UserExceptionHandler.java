package cn.mrain22.user.modules.controller;

import cn.mrain22.common.entity.ServerResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author: Xiuming Lee
 * @Date: 2019/5/16 9:56
 * @Version 1.0
 * @Describe: 全局异常处理类
 */
@RestControllerAdvice
public class UserExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public ServerResult error(Exception e) {
        e.printStackTrace();
        return ServerResult.createByErrorMessage(e.getMessage());
    }
}
