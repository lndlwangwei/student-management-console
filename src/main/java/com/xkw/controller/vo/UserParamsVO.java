package com.xkw.controller.vo;

import com.xkw.common.Pagination;
import com.xkw.domain.User;

public class UserParamsVO extends Pagination<User> {

    private String userName;

    private String gender;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
