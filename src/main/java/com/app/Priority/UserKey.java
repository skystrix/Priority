package com.app.Priority;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;


public class UserKey implements Serializable {
    @Id
    @GeneratedValue
    Integer userID;
    @Id
    Integer priorityID;

    public UserKey(){}

    public UserKey(Integer userID, Integer priorityID) {
        this.userID = userID;
        this.priorityID = priorityID;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserKey userKey = (UserKey) o;
        return userID.equals(userKey.userID) &&
                priorityID.equals(userKey.priorityID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID, priorityID);
    }
}
