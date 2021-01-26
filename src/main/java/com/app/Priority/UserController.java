package com.app.Priority;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping(path="/add")
    public @ResponseBody
    String addNewPriority (@RequestBody List<User> users) {

        for(User eachUser : users){
            User newUser = new User();
            newUser.priorityID = eachUser.priorityID;
            newUser.priorityID = eachUser.priorityID;
            newUser.rating = eachUser.rating;
            userRepository.save(newUser);
        }
        return "Saved User with Priority";
    }

    @GetMapping(path="/all")
    public @ResponseBody
    Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

}
