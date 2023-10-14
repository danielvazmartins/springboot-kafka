package br.com.danielvazmartins.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.danielvazmartins.producer.model.UserModel;
import br.com.danielvazmartins.producer.service.UserService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/users")
@RequiredArgsConstructor // Create a constructor with the required or not initialized fields
public class UserController {

    private final UserService userService;

    /*
    // Constructor created by @RequiredArgsConstructor
    public UserController(UserService userService) {
        this.userService = userService;
    } 
    */

    @PostMapping
    public ResponseEntity<UserModel> register(@RequestBody UserModel newUser) {
        userService.sendUserToKafka("register-user", newUser);
        return ResponseEntity.ok(newUser);
    }
}
