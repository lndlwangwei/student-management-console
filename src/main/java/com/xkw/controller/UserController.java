package com.xkw.controller;

import com.xkw.common.Pagination;
import com.xkw.controller.vo.UserParamsVO;
import com.xkw.domain.User;
import com.xkw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public Pagination<User> getAll(UserParamsVO params) {
        int count = userService.countByParam(params);

        List<User> users = userService.getByParams(params);

        Pagination<User> pagination = new Pagination<>(params.getCurrentPage(), params.getPageSize(), count, users);

        return pagination;
    }

    @PostMapping
    public User add(@Valid @RequestBody User user) {
        return userService.add(user);
    }

    @PutMapping("/{id}")
    public boolean update(@PathVariable int id, @Valid @RequestBody User user) {
        user.setId(id);
        return userService.update(user);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable int id) {
        return userService.delete(id);
    }
}
