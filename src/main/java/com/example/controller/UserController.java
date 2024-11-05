package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "http://localhost:9528", maxAge = 3600)
public class UserController {
    /*@Resource
    private userMapper userMapper;

    @RequestMapping("get")
    public List<user> getUserInfo(){
        return userMapper.getUserInfo();
    }*/
    @Resource
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        System.out.println(userService.getAllUsers());
        return userService.getAllUsers();
    }

    @GetMapping("/{uId}")
    public User getUserById(@PathVariable String uId) {
        return userService.getUserById(uId);
    }

    @PostMapping
    public void saveUser(@RequestBody User user) {
        userService.saveUser(user);
    }

    @PostMapping("/update")
    public void updateUser(@RequestBody User user) {
        userService.updateUser(user);
    }

    @DeleteMapping("/{uId}")
    public void deleteUser(@PathVariable String uId) {
        userService.deleteUser(uId);
    }

}
