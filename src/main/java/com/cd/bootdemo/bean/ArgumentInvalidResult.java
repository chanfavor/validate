package com.cd.bootdemo.bean;

import java.io.Serializable;

public class ArgumentInvalidResult implements Serializable {

    private static final long serialVersionUID = 5204454000321411087L;

    private String defaultMessage;

    private String field;

    private Object rejectedValue;

    public ArgumentInvalidResult() {
    }

    public String getDefaultMessage() {
        return defaultMessage;
    }

    public void setDefaultMessage(String defaultMessage) {
        this.defaultMessage = defaultMessage;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Object getRejectedValue() {
        return rejectedValue;
    }

    public void setRejectedValue(Object rejectedValue) {
        this.rejectedValue = rejectedValue;
    }
}
