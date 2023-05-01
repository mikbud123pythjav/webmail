package com.webmail.webmail;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.rmi.registry.Registry;

@NoArgsConstructor
@Component
public class Service {
    private DatebaseConncetion datebaseConncetion;

    @Autowired
    public Service(DatebaseConncetion datebaseConncetion) {
        this.datebaseConncetion = datebaseConncetion;
    }

    public void registerUser(String username, String password) {
        datebaseConncetion.addUserToDataBase(username, password);


    }

    public void saveToDB() {


    }

    public void deleteFromDB() {

    }

    public void updateDB() {

    }


    public void sendMail() {

    }

    public void takeMail() {

    }

    public void contain() {

    }
}
