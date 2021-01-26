package com.app.Priority;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/priority")
public class PriorityController {
    @Autowired
    private PriorityDao priorityDao;

    @PostMapping(path="/add")
    public @ResponseBody
    String addNewPriority (@RequestBody List<Priority> priorities) {

        for(Priority p : priorities){
            Priority n = new Priority();
            n.priorityID = p.priorityID;
            n.priority = p.priority;
            priorityDao.save(n);
        }
        return "Saved Priority";
    }

    @GetMapping(path="/all")
    public @ResponseBody
    Iterable<Priority> getAllUsers() {
        return priorityDao.findAll();
    }

}
