package com.webmail.webmail;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JdbcUsers {
    private int idUser;
    private String UserMail;
    private String UserPassword;

}
