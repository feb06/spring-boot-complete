package com.kwikr.user.controller;

import com.kwikr.user.VO.ResponseTemplateVO;
import com.kwikr.user.entity.User;
import com.kwikr.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public ResponseEntity<User> saveUser(@RequestBody User user){
        log.info("saveUser Save User "+user);
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseTemplateVO> getUserWithDepartment(@PathVariable long id){
        log.info("getUserWithDepartment Find User with User Id "+ id);
        return new ResponseEntity<>(userService.getUserWithDepartment(id), HttpStatus.OK);
    }
}
