package com.xiaolin.request;

import java.io.Serializable;

public class RegisterRequest implements Serializable {

    private static final long serialVersionUID = 3261811000701644547L;

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
