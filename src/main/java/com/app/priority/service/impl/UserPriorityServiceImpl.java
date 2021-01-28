package com.app.priority.service.impl;

import com.app.priority.models.User;
import com.app.priority.models.UserPriorities;
import com.app.priority.repository.UserPriorityDao;
import com.app.priority.service.UserPriorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserPriorityServiceImpl implements UserPriorityService {
    @Autowired
    UserPriorityDao userPriorityDao;

    @Override
    public List<UserPriorities> addNewUserPriority(List<UserPriorities> userPriorities) {
        List<UserPriorities> usersPriorities = new ArrayList<UserPriorities>();

        for(UserPriorities eachUserPriority : userPriorities){
            UserPriorities newUserPriority = new UserPriorities();
            newUserPriority.setId(newUserPriority.getId());
            newUserPriority.setPriorityId(newUserPriority.getPriorityId());
            newUserPriority.setUserId(newUserPriority.getUserId());
            newUserPriority.setRating(newUserPriority.getRating());
            usersPriorities.add(userPriorityDao.save(newUserPriority));
        }
        return usersPriorities;
    }
}
