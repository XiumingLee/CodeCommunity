package cn.mrain22.common.entity;

/**
 * @Author: Xiuming Lee
 * @Date: 2019/5/15 18:25
 * @Version 1.0
 * @Describe: 返回状态码实体类
 */
public enum  StatusCode {
    /** 成功*/
    SUCCESS(20000,"SUCCESS"),
    /** 失败*/
    ERROR(20001,"ERROR"),
    /** 用户名密码错误*/
    LOGIN_ERROR(20002,"LOGIN_ERROR"),
    /** 权限不足*/
    ACCESS_ERROR(20003,"ACCESS_ERROR"),
    /** 远程调用失败*/
    REMOT_EERROR(20004,"REMOT_EERROR"),
    /** 重复操作*/
    REP_ERROR(20005,"REP_ERROR"),
    /** 非法参数*/
    ILLEGAL_ARGUMENT(20006,"ILLEGAL_ARGUMENT");


    private final int code;
    private final String desc;
    StatusCode(int code,String desc){
        this.code = code;
        this.desc = desc;
    }

    public int getCode(){
        return code;
    }
    public String getDesc(){
        return desc;
    }
}
