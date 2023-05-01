package com.webmail.webmail;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "www.webmail.com")
public class Controller {

    private Service service;

    public Controller(Service service) {
        this.service = service;
    }
//    @GetMapping(path="/Register")
//    public register(){

}

