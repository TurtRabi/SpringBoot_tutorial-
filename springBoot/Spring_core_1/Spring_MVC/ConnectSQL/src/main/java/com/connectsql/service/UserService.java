package com.connectsql.service;

import com.connectsql.dto.request.UserCreationRequest;
import com.connectsql.dto.request.userUpdateRequest;
import com.connectsql.entity.User;
import com.connectsql.exception.AppException;
import com.connectsql.exception.ErrorCode;
import com.connectsql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createRequest(UserCreationRequest request){
        User user= new User();

        if(userRepository.existsByUserName(request.getUserName())){
            throw  new AppException(ErrorCode.USER_EXISTED);
        }

        user.setUserName(request.getUserName());
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setDob(request.getDob());
        return  userRepository.save(user);
    }
    public List<User> getUsers(){
        return userRepository.findAll();
    }
    public User getUser(String id){
        return userRepository.findById(id).
                orElseThrow(()->new RuntimeException("not found user"));
    }
    public User updateUser(String userId,userUpdateRequest request){
        User user = getUser(userId);
        System.out.println(user.getUserName());
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setDob(request.getDob());
        return userRepository.save(user);
    }
    public void deleteUser(String userId){
        userRepository.deleteById(userId);
    }
}
