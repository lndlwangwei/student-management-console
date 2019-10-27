package com.xkw.repository;

import com.xkw.domain.User;

import java.util.List;

public interface UserRepository {
    List<User> getAll();

    User getByName(String username);

    boolean add(User user);

    boolean update(User user);

    boolean delete(int id);
}
