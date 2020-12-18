package com.hzsun.commons.exception;

/**
 * @Author: DingJl
 * @Date: 2020/12/17 16:04
 * @Version 1.0
 */
public class HZSunServiceException extends RuntimeException {

    private String errCode;

    private String errMsg;

    public HZSunServiceException() {
    }

    public HZSunServiceException(String errCode, String errMsg) {
        super(errCode + ":" + errMsg);
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public HZSunServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public HZSunServiceException(String message) {
        super(message);
    }

    public HZSunServiceException(Throwable cause) {
        super(cause);
    }

    public HZSunServiceException(String errCode, String errMsg, Throwable throwable) {
        super(errCode + ":" + errMsg, throwable);
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}

