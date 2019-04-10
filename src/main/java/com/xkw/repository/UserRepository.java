package com.xkw.repository;

import com.xkw.controller.vo.UserParamsVO;
import com.xkw.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserRepository {
    List<User> getAll();

    List<User> getByParam(UserParamsVO params);

    int countByParam(UserParamsVO params);

    boolean add(User user);

    boolean update(User user);

    boolean delete(int id);
}
