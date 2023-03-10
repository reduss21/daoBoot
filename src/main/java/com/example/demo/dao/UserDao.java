package com.example.demo.dao;


import com.example.demo.models.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    User getUserById(long id);

    void add(User user);

    void update(Long id, User newUser);

    void delete(long id);
}
