package com.tran.ebay.model;

public class User {
    private String user;
    private String pwd;
    

    public User setUser(String user) {
        this.user = user;
        return this;
    }

    public User setPwd(String pwd) {
        this.pwd = pwd;
        return this;
    }

    public String getUser() {
        return user;
    }

    public String getPwd() {
        return pwd;
    }
}
