package com.access.login.controller;

import com.access.login.entity.User;
import com.access.login.model.UserModel;
import com.access.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody UserModel userModel){
        User user = userService.registerUser(userModel);
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }
}
