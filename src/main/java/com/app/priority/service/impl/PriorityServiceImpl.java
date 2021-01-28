package com.app.priority.service.impl;

import com.app.priority.models.Priority;
import com.app.priority.models.User;
import com.app.priority.models.UserPriorities;
import com.app.priority.repository.PriorityDao;
import com.app.priority.service.PriorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PriorityServiceImpl implements PriorityService {
    @Autowired
    PriorityDao priorityDao;

    @Override
    public List<Priority> addNewPriority(List<Priority> priorities) {
        List<Priority> prioritiesCreated = new ArrayList<Priority>();

        for(Priority eachPriority : priorities){
            Priority newPriority = new Priority();
            newPriority.setPriorityID(eachPriority.getPriorityID());
            newPriority.setPriority(eachPriority.getPriority());
            prioritiesCreated.add(priorityDao.save(newPriority));

        }
        return prioritiesCreated;
    }

}
