package com.blue.modules.json;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 接口返回值类定义
 *
 * @author jerryY
 */
public class JsonResult<T> implements Serializable {

    private static final long serialVersionUID = 1L;
    private boolean success;
    private T returnValue;
    private int errorCode;
    private String errorReason = "";

    /**
     * 接口调用是否成功
     */
    @JsonProperty("success")
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }


    /**
     * 接口调用返回的内容
     */
    @JsonProperty("returnValue")
    public T getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(T returnValue) {
        this.returnValue = returnValue;
    }

    /**
     * 接口调用失败时错误码
     */
    @JsonProperty("errorCode")
    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * 接口调用失败时错误原因
     */
    @JsonProperty("errorReason")
    public String getErrorReason() {
        return errorReason;
    }

    public void setErrorReason(String errorReason) {
        this.errorReason = errorReason;
    }


    public static <T> JsonResult<T> newInstance() {
        return new JsonResult<T>();
    }

    @Override
    public String toString() {
        return "{" +
                "\"success\":" + success +
                ", \"returnValue\":" + returnValue +
                ", \"errorCode\":" + errorCode +
                ",\" errorReason\":'" + errorReason + '\'' +
                '}';
    }
}
