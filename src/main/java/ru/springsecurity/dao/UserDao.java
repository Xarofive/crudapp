package ru.springsecurity.dao;

import ru.springsecurity.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    void updateUser(User user);

    void removeUser(long id);

    User getUserById(long id);

    List<User> listUsers();

    User getUserByUsername(String username);
}