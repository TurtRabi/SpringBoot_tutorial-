package com.reviewtest.controller;

import com.reviewtest.dto.request.UserCreationRequest;
import com.reviewtest.entity.User;
import com.reviewtest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/users")
    User createUser(@RequestBody UserCreationRequest request){
        return  userService.CreateUser(request);
    }
    @PostMapping("/testGGAPI")
    String getGGAPI(){
        return "testGGAPI";
    }
}
