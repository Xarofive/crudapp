package ru.springsecurity.service;

import ru.springsecurity.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void updateUser(User user);
    void removeUser(long id);
    User getUserById(long id);
    List<User> listUsers();
    User getUserByUsername(String username);
}
