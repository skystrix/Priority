package com.app.priority.controllers;

import com.app.priority.models.User;
import com.app.priority.models.UserPriorities;
import com.app.priority.repository.UserPriorityDao;
import com.app.priority.service.UserPriorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/userpriority")
public class UserPriorityController {
    @Autowired
    private UserPriorityDao userPriorityDao;

    @Autowired
    UserPriorityService userPriorityService;

    @PostMapping(path="/")
    public ResponseEntity<List<UserPriorities>> addNewPriority (@RequestBody List<UserPriorities> users) {
        return new ResponseEntity<>(userPriorityService.addNewUserPriority(users), HttpStatus.OK);
    }

    @GetMapping(path="/")
    public @ResponseBody
    Iterable<UserPriorities> getAllUserPriorities() {
        return userPriorityDao.findAll();
    }


}
