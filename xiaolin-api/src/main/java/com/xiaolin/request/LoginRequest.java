package com.xiaolin.request;

import java.io.Serializable;

public class LoginRequest implements Serializable {

    private static final long serialVersionUID = -5905833237953344994L;

    private String mobile;
    private String password;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
