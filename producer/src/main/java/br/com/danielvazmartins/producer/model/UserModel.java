package br.com.danielvazmartins.producer.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor // Create a constructor with one parameter to each field in the class
public class UserModel {
    String name;
    String username;
    String email;
    String password;
}
