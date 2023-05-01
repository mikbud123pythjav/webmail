package com.webmail.webmail;

import org.springframework.stereotype.Component;

@Component
public class DatebaseConncetion {
    private String host;
    private String username;
    private String password;


    public DatebaseConncetion(String host, String username, String password) {
        this.host = host;
        this.password = password;
        this.username = username;
    }

    public void addUserToDataBase(String username, String password) {

    }
}
