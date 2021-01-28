package com.app.priority.service;

import com.app.priority.models.Priority;
import com.app.priority.models.UserPriorities;

import java.util.List;

public interface UserPriorityService {
    public List<UserPriorities> addNewUserPriority(List<UserPriorities> userPriorities);
}
