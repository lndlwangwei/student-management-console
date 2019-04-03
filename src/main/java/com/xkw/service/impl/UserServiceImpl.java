package com.xkw.service.impl;

import com.xkw.controller.vo.UserParamsVO;
import com.xkw.domain.User;
import com.xkw.repository.UserRepository;
import com.xkw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.getAll();
    }

    @Override
    public List<User> getByParams(UserParamsVO params) {
        return userRepository.getByParam(params);
    }
}
