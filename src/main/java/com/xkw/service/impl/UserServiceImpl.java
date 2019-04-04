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

    @Override
    public int countByParam(UserParamsVO params) {
        return userRepository.countByParam(params);
    }

    @Override
    public User add(User user) {
        userRepository.add(user);

        UserParamsVO params = new UserParamsVO();
        params.setId(user.getId());
        return this.getByParams(params).get(0);
    }

    @Override
    public boolean update(User user) {
        return userRepository.update(user);
    }

    @Override
    public boolean delete(int id) {
        return userRepository.delete(id);
    }
}
