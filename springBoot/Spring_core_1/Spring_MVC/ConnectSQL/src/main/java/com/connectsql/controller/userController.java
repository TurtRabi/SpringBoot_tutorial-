package com.connectsql.controller;

import com.connectsql.dto.request.ApiResponse;
import com.connectsql.dto.request.UserCreationRequest;
import com.connectsql.dto.request.userUpdateRequest;
import com.connectsql.entity.User;
import com.connectsql.service.UserService;
import jakarta.validation.Valid;
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
    public ApiResponse<User> createUser(@RequestBody @Valid UserCreationRequest request){
        ApiResponse<User> response = new ApiResponse<>();
        response.setResult(userService.createRequest(request));
        return response;
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
