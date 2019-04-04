package com.xkw.service;

import com.xkw.controller.vo.UserParamsVO;
import com.xkw.domain.User;

import java.util.List;

public interface UserService {
    List<User> getAll();

    List<User> getByParams(UserParamsVO params);

    int countByParam(UserParamsVO params);

    User add(User user);

    boolean update(User user);

    boolean delete(int id);
}
