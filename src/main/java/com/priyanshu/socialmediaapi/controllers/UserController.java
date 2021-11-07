package com.priyanshu.socialmediaapi.controllers;

import com.priyanshu.socialmediaapi.error.UserAlreadyExistsException;
import com.priyanshu.socialmediaapi.models.User;
import com.priyanshu.socialmediaapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService=userService;
    }

    @GetMapping("/")
    public List<User> getAllUsers() {
        return userService.findAllUsers();
    }

    @PostMapping("/")
    public User createUser(@RequestBody User user) throws UserAlreadyExistsException {
        return userService.createUser(user.getName(), user.getPassword(), user.getEmail(), user.getAge());
    }
}
