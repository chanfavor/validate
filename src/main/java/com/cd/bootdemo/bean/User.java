package com.cd.bootdemo.bean;


import com.cd.bootdemo.validator.Age;

import javax.validation.constraints.NotNull;

public class User {

    private int id;

    @NotNull
    private String userName;

    @Age(min = 20, max = 30)
    private int age;
//    @NotNull(message = "desc必填")
    private String desc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                ", desc='" + desc + '\'' +
                '}';
    }
}
