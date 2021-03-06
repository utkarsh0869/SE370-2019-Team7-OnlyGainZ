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
    String goalDifficulty;
    String goalType;

    public Goals(String goalAuthor, String goalDesc, String goalEndDate, String goalDifficulty, String goalType) {
        this.goalAuthor = goalAuthor;
        this.goalDesc = goalDesc;
        this.goalEndDate = goalEndDate;
        this.goalDifficulty = goalDifficulty;
        this.goalType = goalType;
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

    public String getGoalDifficulty() {
        return goalDifficulty;
    }

    public void setGoalDifficulty(String goalDifficulty) {
        this.goalDifficulty = goalDifficulty;
    }

    public String getGoalType() {
        return goalType;
    }

    public void setGoalType(String goalType) {
        this.goalType = goalType;
    }
 
    
    
     
}