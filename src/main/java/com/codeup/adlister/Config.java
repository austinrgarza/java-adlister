package com.codeup.adlister;

public class Config {
    String url = "jdbc:mysql://localhost/adlister_db";
    String user = "test_guy";
    String password = "password";

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
