package com.example.datadogth.services;

import com.example.datadogth.entities.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    boolean updateUserName(String userEmail, String userName);
    boolean deleteUserByEmail(String userEmail);

    //ADMIN
    List<User> getAllUsers();
}
