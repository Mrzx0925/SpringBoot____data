package com.zx.springboot.controller;

import com.zx.springboot.entity.User;
import com.zx.springboot.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserRespository userRespository;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id){
        Optional<User> user =  userRespository.findById(id);

        return user.get();
    }

    @GetMapping("/user")
    public User insertUser(User user){
       User save = userRespository.save(user);

        return save;
    }
}
