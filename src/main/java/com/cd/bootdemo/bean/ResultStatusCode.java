package com.cd.bootdemo.bean;

public enum ResultStatusCode {

    PARAMETER_ERROR(4001, "参数错误");

    private int errcode;

    private String errmsg;

    ResultStatusCode(int errcode, String errmsg) {
        this.errcode = errcode;
        this.errmsg = errmsg;
    }

    public int getErrcode() {
        return errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }
}
