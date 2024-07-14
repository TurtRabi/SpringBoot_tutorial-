package org.example.springcorediex3.service;

import org.springframework.stereotype.Service;

@Service("SMSService")
public class SMSService implements MessagerService{
    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }
}
