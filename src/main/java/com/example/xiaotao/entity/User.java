package com.example.xiaotao.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    String username;
    String password;
    Integer uid;
    String account;
    String avatarurl;
}
