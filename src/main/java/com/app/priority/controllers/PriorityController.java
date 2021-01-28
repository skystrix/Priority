package com.app.priority.controllers;

import com.app.priority.repository.PriorityDao;
import com.app.priority.models.Priority;
import com.app.priority.service.PriorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/priority")
public class PriorityController {
    @Autowired
    private PriorityDao priorityDao;
    @Autowired
    public PriorityService priorityService;

    @PostMapping(path="/")
    @ResponseBody
    public ResponseEntity<List<Priority>> addNewPriority (@RequestBody List<Priority> priorities) {
        return new ResponseEntity<>(priorityService.addNewPriority(priorities), HttpStatus.OK);
    }

    @GetMapping(path="/")
    public @ResponseBody
    Iterable<Priority> getAllUsers() {
        return priorityDao.findAll();
    }

}
