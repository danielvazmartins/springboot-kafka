package br.com.danielvazmartins.producer.model;

import lombok.Data;

@Data
public class UserModel {
    String name;
    String username;
    String email;
    String password;
}