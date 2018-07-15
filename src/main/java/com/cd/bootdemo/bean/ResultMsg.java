package com.cd.bootdemo.bean;

import java.io.Serializable;
import java.util.List;

public class ResultMsg{


    private int code;

    private String message;

    private List<ArgumentInvalidResult> invalidResults;

    public ResultMsg() {
    }

    public ResultMsg(int code, String message, List<ArgumentInvalidResult> invalidResults) {
        this.code = code;
        this.message = message;
        this.invalidResults = invalidResults;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setInvalidResults(List<ArgumentInvalidResult> invalidResults) {
        this.invalidResults = invalidResults;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public List<ArgumentInvalidResult> getInvalidResults() {
        return invalidResults;
    }

    @Override
    public String toString() {
        return "ResultMsg{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", invalidResults=" + invalidResults +
                '}';
    }
}
