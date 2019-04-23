package com.itlowry.dto;

import java.io.Serializable;

public class UserResponse implements Serializable {

    private static final long serialVersionUID = -9095197446912376587L;
    private String uid;        //用户id
    private String userName;   //用户名
    private int age;           //年龄
    private int sex;           //性别 0：男   1：女

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
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

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "UserResponse{" +
                "uid='" + uid + '\'' +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
