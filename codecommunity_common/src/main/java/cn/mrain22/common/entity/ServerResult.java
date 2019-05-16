package cn.mrain22.common.entity;

/**
 * @Author: Xiuming Lee
 * @Date: 2019/5/15 18:19
 * @Version 1.0
 * @Describe: 返回实体类
 */
public class ServerResult<T> {
    private boolean flag;
    private int code;
    private String message;
    private T data;

    public static <T> ServerResult<T> createBySuccess() {
        return new ServerResult<T>(true, StatusCode.SUCCESS.getCode());
    }

    public static <T> ServerResult<T> createBySuccessMessage(String msg) {
        return new ServerResult<T>(true, StatusCode.SUCCESS.getCode(), msg);
    }

    public static <T> ServerResult<T> createBySuccessData(T data) {
        return new ServerResult<T>(true, StatusCode.SUCCESS.getCode(), data);
    }

    public static <T> ServerResult<T> createBySuccess(String msg, T data) {
        return new ServerResult<T>(true, StatusCode.SUCCESS.getCode(), msg, data);
    }


    public static <T> ServerResult<T> createByError() {
        return new ServerResult<T>(false, StatusCode.ERROR.getCode(), StatusCode.ERROR.getDesc());
    }

    public static <T> ServerResult<T> createByErrorMessage(String errorMessage) {
        return new ServerResult<T>(false, StatusCode.ERROR.getCode(), errorMessage);
    }

    public static <T> ServerResult<T> createByErrorData(T data) {
        return new ServerResult<T>(false, StatusCode.ERROR.getCode(), data);
    }

    public static <T> ServerResult<T> createByError(String errorMessage, T data) {
        return new ServerResult<T>(false, StatusCode.ERROR.getCode(), errorMessage, data);
    }

    public static <T> ServerResult<T> createByErrorCodeMessage(StatusCode code, String errorMessage) {
        return new ServerResult<T>(false, code.getCode(), errorMessage);
    }

    public static <T> ServerResult<T> createByErrorCodeData(StatusCode code, T data) {
        return new ServerResult<T>(false, code.getCode(), data);
    }

    public static <T> ServerResult<T> createByErrorCodeMessageData(StatusCode code, String errorMessage, T data) {
        return new ServerResult<T>(false, code.getCode(), errorMessage, data);
    }

    private ServerResult(boolean flag, int code) {
        this.flag = flag;
        this.code = code;
    }

    private ServerResult(boolean flag, int code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

    private ServerResult(boolean flag, int code, T data) {
        this.flag = flag;
        this.code = code;
        this.data = data;
    }

    private ServerResult(boolean flag, int code, String message, T data) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public boolean getFlag() {
        return flag;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }
}
