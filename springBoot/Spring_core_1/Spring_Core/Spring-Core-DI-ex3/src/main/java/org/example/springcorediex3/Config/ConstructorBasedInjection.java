package org.example.springcorediex3.Config;

import org.example.springcorediex3.service.MessagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ConstructorBasedInjection {
    @Qualifier("EmailService")
    @Autowired
    private MessagerService messagerService;

    public void processMsg(String message){
        messagerService.sendMessage(message);
    }
}
