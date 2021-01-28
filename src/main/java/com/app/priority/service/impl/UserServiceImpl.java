package com.app.priority.service.impl;

import com.app.priority.models.User;
import com.app.priority.service.UserService;
import com.app.priority.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> addNewUser(List<User> users) {
        List<User> usersCreated = new ArrayList<User>();

        for(User eachUser : users){
            User newUser = new User();
            newUser.setUserId(eachUser.getUserId());
            newUser.setName(eachUser.getName());
            newUser.setEmail(eachUser.getEmail());
            usersCreated.add(userRepository.save(newUser));

        }
        return usersCreated;
    }


}
