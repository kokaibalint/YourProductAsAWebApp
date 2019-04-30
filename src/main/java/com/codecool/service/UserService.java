package com.codecool.service;

import com.codecool.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private List<User> users;
    private static UserService ourInstance = new UserService();

    public UserService() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }

    public static UserService getInstance() {
        return ourInstance;
    }
}
