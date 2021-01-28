package com.app.priority.controllers;

import com.app.priority.repository.UserRepository;
import com.app.priority.models.User;
import com.app.priority.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    UserService userService;

    @PostMapping(path="/")
    public ResponseEntity<List<User>> addNewPriority (@RequestBody List<User> users) {
        return new ResponseEntity<>(userService.addNewUser(users), HttpStatus.OK);
    }

    @GetMapping(path="/")
    public @ResponseBody
    Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

}
