package com.xkw.service;

import com.xkw.domain.User;

import java.util.List;

public interface UserService {
    List<User> getAll();

    User getUserByName(String username);

    boolean add(User user);

    boolean update(User user);

    boolean delete(int id);
}
