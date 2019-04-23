package com.itlowry.dto;

import java.io.Serializable;

public class UserRequest implements Serializable {

    private static final long serialVersionUID = -4525078393794619764L;
    private String uid;     //用户id

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }


}
