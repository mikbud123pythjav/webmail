package com.webmail.webmail;


import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("www.webmail.com")
@NoArgsConstructor
public class WebmailController {

    @Autowired
    private WebmailRepository webmailRepository;

    @GetMapping("/register")
    public WebmailRepository addUser(){
        webmailRepository.getAll();
        return null;
    }
}
