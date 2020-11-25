import java.io.*;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author utkarshgerrard
 */
public class Goals implements Serializable{
    String goalAuthor;
    String goalDesc;
    String goalEndDate; // deadline
    Boolean goalStatus;

    public Goals(String goalAuthor, String goalDesc, String goalEndDate, Boolean goalStatus) {
        this.goalAuthor = goalAuthor;
        this.goalDesc = goalDesc;
        this.goalEndDate = goalEndDate;
        this.goalStatus = goalStatus;
    }

    public String getGoalAuthor() {
        return goalAuthor;
    }

    public void setGoalAuthor(String goalAuthor) {
        this.goalAuthor = goalAuthor;
    }

    public String getGoalDesc() {
        return goalDesc;
    }

    public void setGoalDesc(String goalDesc) {
        this.goalDesc = goalDesc;
    }

    public String getGoalEndDate() {
        return goalEndDate;
    }

    public void setGoalEndDate(String goalEndDate) {
        this.goalEndDate = goalEndDate;
    }

    public Boolean getGoalStatus() {
        return goalStatus;
    }

    public void setGoalStatus(Boolean goalStatus) {
        this.goalStatus = goalStatus;
    }      
}