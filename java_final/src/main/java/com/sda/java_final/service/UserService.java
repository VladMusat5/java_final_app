package com.sda.java_final.service;

import com.sda.java_final.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> getAllUsers();

    Optional<User> getUserById(Long id);

    User saveUser(User user);

    User updateUser(User user);

    void deleteUserById(Long id);
}
