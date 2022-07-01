package com.qadeer.user.controller;

import com.qadeer.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.qadeer.user.service.UserService;

import javax.validation.Valid;
import java.io.BufferedReader;
import java.io.IOException;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;
    // POST methods
    @GetMapping("/get")
    public String createTeacher() throws IOException {
        return userService.getUser();
    }

    @GetMapping
    public String hello() {
        return "Hello";
    }
}
