package com.xkw.controller;

import com.xkw.domain.User;
import com.xkw.service.UserService;
import org.apache.catalina.security.SecurityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<User> getAll() {
        return userService.getAll();
    }

    @PostMapping
    public boolean add(@RequestBody User user) {
        return userService.add(user);
    }

    @PutMapping("/{id}")
    public boolean update(@PathVariable int id, @RequestBody User user) {
        user.setId(id);
        return userService.update(user);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable int id) {
        return userService.delete(id);
    }

    @GetMapping("/my-info")
    public User getMyUserInfo() {
        return userService.getUserByName("admin");
    }
}
