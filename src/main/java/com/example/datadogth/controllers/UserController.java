package com.example.datadogth.controllers;

import com.example.datadogth.entities.User;
import com.example.datadogth.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String getIndex() {
        return "Welcome to the Home Page";
    }

    @PostMapping("/signup")
    public User createUser(@RequestBody User user) {
        return this.userService.createUser(user);
    }

    @PutMapping("/user/update")
    public boolean updateUserName(@RequestBody String userName, Principal principal) {
        return this.userService.updateUserName(principal.getName(), userName);
    }

    @DeleteMapping("/user")
    public boolean deleteUser(Principal principal) {
        return this.userService.deleteUserByEmail(principal.getName());
    }

    @GetMapping("/admin/users")
    public List<User> getAllUsers() {
        return this.userService.getAllUsers();
    }
}
