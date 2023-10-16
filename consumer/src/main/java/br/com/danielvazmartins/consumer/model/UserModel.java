package br.com.danielvazmartins.consumer.model;

import lombok.Data;

@Data
public class UserModel {
    String name;
    String username;
    String email;
    String password;
}