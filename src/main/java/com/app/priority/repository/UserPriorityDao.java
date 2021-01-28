package com.app.priority.repository;

import com.app.priority.models.UserPriorities;
import org.springframework.data.repository.CrudRepository;

public interface UserPriorityDao extends CrudRepository<UserPriorities, Integer> {
}
