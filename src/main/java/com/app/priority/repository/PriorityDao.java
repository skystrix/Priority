package com.app.priority.repository;

import com.app.priority.models.Priority;
import org.springframework.data.repository.CrudRepository;

public interface PriorityDao extends CrudRepository<Priority, Integer> {

}
