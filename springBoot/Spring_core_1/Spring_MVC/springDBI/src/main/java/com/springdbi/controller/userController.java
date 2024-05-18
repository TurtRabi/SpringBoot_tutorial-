package com.springdbi.controller;

import com.springdbi.dto.request.UserCreationRequest;
import com.springdbi.entity.User;
import com.springdbi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class userController {
    @Autowired
    private UserService userService;

    @PostMapping("/users")
    User createUser(@RequestBody UserCreationRequest request){

        return userService.createUser(request);
    }
    @GetMapping("/{id}")
    public Optional<User> getUserByID(@PathVariable String id){
        return userService.getUserById(id);
    }
}
