package com.example.mybatisdemo01.mapper;

import com.example.mybatisdemo01.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
     User sel(int id);
     int saveUser(User user);

     int deleteById(int id);

     int updateUser(User user);

     User queryUserById(int id);

     List<User> queryUsers();
}
