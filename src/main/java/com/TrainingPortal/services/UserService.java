package com.TrainingPortal.services;

import com.TrainingPortal.models.User;
import com.TrainingPortal.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserService {

    @Autowired
    UserRepositories userRepo;

    public User getUserProfile(String emailid) {

         User user = userRepo.getUserByEmail(emailid);

         return user;

    }
}