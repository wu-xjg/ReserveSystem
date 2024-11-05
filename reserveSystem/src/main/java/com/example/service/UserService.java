package com.example.service;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    public User getUserById(String uId) {
        return userMapper.getUserById(uId);
    }

    public void saveUser(User user) {
        userMapper.insertUser(user);
    }
    public void updateUser(User user){
        userMapper.updateUser(user);
    };
    public void deleteUser(String uId) {
        userMapper.deleteUserById(uId);
    }
}
