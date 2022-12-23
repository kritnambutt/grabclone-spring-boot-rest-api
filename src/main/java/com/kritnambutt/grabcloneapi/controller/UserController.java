package com.kritnambutt.grabcloneapi.controller;

import com.kritnambutt.grabcloneapi.entity.User;
import com.kritnambutt.grabcloneapi.model.APIResponse;
import com.kritnambutt.grabcloneapi.repository.UserRepository;
import com.kritnambutt.grabcloneapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public APIResponse<List<User>> getUsers() {
        List<User> allUsers = userService.findAllUsers();
        return new APIResponse<>(allUsers.size(), allUsers);
    }
}
