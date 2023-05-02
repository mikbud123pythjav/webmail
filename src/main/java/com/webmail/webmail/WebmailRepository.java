package com.webmail.webmail;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WebmailRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public List<JdbcUsers> setUser(String username, String password) {
        List<JdbcUsers> setter = jdbcTemplate.query("INSERT INTO Users (User_mail, User_password) VALUSE (%s , %s)".
                        formatted(username, password), BeanPropertyRowMapper.newInstance(JdbcUsers.class));
        return setter;
    }

    public List<JdbcMails> setMail(String mailsText) {
        List<JdbcMails> setter = jdbcTemplate.query("INSERT INTO Mails (Mail_Text) VALUSE (%s)".
        formatted(mailsText), BeanPropertyRowMapper.newInstance(JdbcMails.class));
        return setter;
    }


    public List<JdbcUsers> getAllUsers() {
        List<JdbcUsers> query = jdbcTemplate.query("SELECT id, username, password FROM JdbcVariables",
                BeanPropertyRowMapper.newInstance(JdbcUsers.class));
        return query;
    }

    public List<JdbcMails> getAllMails() {
        List<JdbcMails> query = jdbcTemplate.query("SELECT id, username, password FROM JdbcVariables",
                BeanPropertyRowMapper.newInstance(JdbcMails.class));
        return query;
    }
}