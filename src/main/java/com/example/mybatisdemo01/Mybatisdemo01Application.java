package com.example.mybatisdemo01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.mybatisdemo01.mapper")
@SpringBootApplication
public class Mybatisdemo01Application {

    public static void main(String[] args) {
        SpringApplication.run(Mybatisdemo01Application.class, args);
    }

}
