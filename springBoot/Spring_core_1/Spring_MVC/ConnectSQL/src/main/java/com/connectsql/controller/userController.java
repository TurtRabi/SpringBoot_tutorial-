package com.connectsql.controller;

import com.connectsql.dto.request.UserCreationRequest;
import com.connectsql.dto.request.userUpdateRequest;
import com.connectsql.entity.User;
import com.connectsql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class userController {
    @Autowired
    private UserService userService;

    @PostMapping
    public User createUser(@RequestBody UserCreationRequest request){
        return userService.createRequest(request);
    }
    @GetMapping
    public List<User> getUsers(){
        return userService.getUsers();
    }
    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") String userId){
        return userService.getUser(userId);
    }
    @PutMapping("/{userId}")
    public User updateUser(@PathVariable String userId, @RequestBody userUpdateRequest request) {
        return userService.updateUser(userId, request);
    }

    @DeleteMapping("/{userID}")
    public void deleteUser(@PathVariable String userID){
        userService.deleteUser(userID);
    }

}
