package com.reviewtest.service;

import com.reviewtest.dto.request.UserCreationRequest;
import com.reviewtest.entity.User;
import com.reviewtest.repository.UserReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserReponsitory userReponsitory;
    public User CreateUser(UserCreationRequest request){
        User user = new User();
        user.setUserName(request.getUserName());
        user.setPassword(request.getPassworld());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        return userReponsitory.save(user);
    }
}
