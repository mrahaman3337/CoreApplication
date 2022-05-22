package com.TrainingPortal.controllers;

import com.TrainingPortal.models.User;
import com.TrainingPortal.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(value = "/getprofile/{emailid}")
    public User getUserProfile(@PathVariable ("emailid")String emailid) {

        User user= userService.getUserProfile(emailid);
        return user;
    }
}
