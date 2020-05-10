package com.example.mybatisdemo01.service;

import com.example.mybatisdemo01.entity.User;
import com.example.mybatisdemo01.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;
    public User sel(int id){
        return userMapper.sel(id);
    }


    public int saveUser(User user){
        return userMapper.saveUser(user);
    }
    public int deleteById(int id){
        return userMapper.deleteById(id);
    }

    public int updateUser(User user){
        return userMapper.updateUser(user);
    }

    public User queryUserById(int id){
        return userMapper.queryUserById(id);
    }

    public List<User> queryUsers(){
        return userMapper.queryUsers();
    }
}
