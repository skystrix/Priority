package com.app.Priority;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;

@Entity
@IdClass(UserKey.class)
public class User{
    @Id
    Integer userID;
    @Id
    Integer priorityID;
    Integer rating;

    public User(){
    }

    public User(Integer userID, Integer priorityID, Integer rating) {
        this.userID = userID;
        this.priorityID = priorityID;
        this.rating = rating;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getPriorityID() {
        return priorityID;
    }

    public void setPriorityID(Integer priorityID) {
        this.priorityID = priorityID;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

}
