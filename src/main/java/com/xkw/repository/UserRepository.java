package com.xkw.repository;

import com.xkw.controller.vo.UserParamsVO;
import com.xkw.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public interface UserRepository {
    List<User> getAll();

    List<User> getByParam(UserParamsVO params);
}
