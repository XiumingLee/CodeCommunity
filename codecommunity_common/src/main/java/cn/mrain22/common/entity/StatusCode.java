package cn.mrain22.common.entity;

/**
 * @Author: Xiuming Lee
 * @Date: 2019/5/15 18:25
 * @Version 1.0
 * @Describe: 返回状态码实体类
 */
public class StatusCode {
    public static final int OK=20000;//成功
    public static final int ERROR =20001;//失败
    public static final int LOGIN_ERROR =20002;//用户名或密码错误
    public static final int ACCESS_ERROR =20003;//权限不足
    public static final int REMOT_EERROR =20004;//远程调用失败
    public static final int REP_ERROR =20005;//重复操作
}
