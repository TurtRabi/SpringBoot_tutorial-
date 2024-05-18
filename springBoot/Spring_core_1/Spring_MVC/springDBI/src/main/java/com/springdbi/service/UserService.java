package com.springdbi.service;

import com.springdbi.dto.request.UserCreationRequest;
import com.springdbi.entity.User;
import com.springdbi.reponsitory.UserReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserReponsitory userReponsitory;

    public User createUser(UserCreationRequest request){
        User user = new User();
        user.setUserName(request.getUserName());
        user.setPassworld(request.getPassworld());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setDob(request.getDob());

        return userReponsitory.save(user);
    }

    public Optional<User> getUserById(String id){
        return  userReponsitory.findById(id);
    }
}
