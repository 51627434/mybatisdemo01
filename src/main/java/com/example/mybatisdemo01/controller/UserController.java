package com.example.mybatisdemo01.controller;

import com.example.mybatisdemo01.entity.User;
import com.example.mybatisdemo01.service.UserService;
import com.example.mybatisdemo01.util.RandomStr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author:kk
 * @Date: 2018/9/26 0026
 */

@RestController
@RequestMapping("/testBoot")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("getUser/{id}")
    public String getUser(@PathVariable int id){
        return userService.sel(id).toString();
    }


    @RequestMapping("saveUser/{id}")
    public int saveUser(@PathVariable int id){

        User user = new User();
        user.setUserNameA(RandomStr.getRandomStr());
        user.setPassWordA(RandomStr.getRandomStr());
        user.setRealNameA(RandomStr.getRandomStr());
        return userService.saveUser(user);
    }


    @RequestMapping("deleteById/{id}")
    public int deleteById(@PathVariable int id){
        return userService.deleteById(id);
    }


    @RequestMapping("updateUser/{id}")
    public int updateUser(@PathVariable int id){

        User user = new User();
        user.setIdA(id);
        user.setUserNameA(RandomStr.getRandomStr());
        user.setPassWordA(RandomStr.getRandomStr());
        user.setRealNameA(RandomStr.getRandomStr());

        System.out.println(user.toString());
        return userService.updateUser(user);
    }



    @RequestMapping("queryUserById/{id}")
    public User queryUserById(@PathVariable int id){
        return userService.queryUserById(id);
    }


    @RequestMapping("queryUsers/{id}")
    public List<User> queryUsers(@PathVariable int id){
        return userService.queryUsers();
    }







}
