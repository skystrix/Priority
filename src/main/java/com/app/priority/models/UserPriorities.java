package com.app.priority.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserPriorities {
    @Id
    @GeneratedValue
    Integer id;

    Integer userId;
    Integer priorityId;
    Integer rating;

    public UserPriorities(){}

    public UserPriorities(Integer id, Integer userId, Integer priorityId, Integer rating) {
        this.id = id;
        this.userId = userId;
        this.priorityId = priorityId;
        this.rating = rating;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(Integer priorityId) {
        this.priorityId = priorityId;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
