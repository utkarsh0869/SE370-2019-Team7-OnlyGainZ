
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author davidflores
 */
public class Exercise implements Serializable {
    private String exerciseName;
    private int exerciseCount;
    private int reps;
    private int time;
    
    public Exercise(){
        
    }
    public Exercise(String exName, int reps, int time){
        this.exerciseName = exName;
        this.reps = reps;
        this.time = time;
    }
    
    /*This function will store the data to a text file
     *name exerciseData"username"
     * @throws IOException 
     */
    public void storeExercise() throws IOException{
        File temp = new File("textfiles/exerciseData" + OnlyGainz.userinfo[3] + ".txt");
        if(temp.exists()){
            try {
                //write to file the data in a new line
                FileWriter fileWriter = new FileWriter(temp, true);
                fileWriter.write(this.exerciseName + " ");    
                fileWriter.write(this.reps + " "); 
                fileWriter.write(this.time + "\n"); 
                fileWriter.flush();
                fileWriter.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(exerciseData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //create file 
        else{
            File exerciseData = new File("textfiles/exerciseData" + OnlyGainz.userinfo[3] + ".txt");
            try {
                exerciseData.createNewFile();
                FileWriter fileWriter = new FileWriter(temp, true);
                fileWriter.write(this.exerciseName + " ");    
                fileWriter.write(this.reps + " "); 
                fileWriter.write(this.time + "\n"); 
                fileWriter.flush();
                fileWriter.close();
               
            }
            catch (IOException ex) {
                Logger.getLogger(exerciseData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public int exerciseCounter(String name) throws FileNotFoundException{
        String ex_name;
        int reps2 = 0;
        int time2 = 0;
        int count = 0;
        File f = new File("textfiles/exerciseData" + OnlyGainz.userinfo[3] + ".txt");
        try (Scanner input = new Scanner(f)) {
            while(input.hasNext()){
                ex_name = input.next();
                reps2 = input.nextInt();
                time2 = input.nextInt();
                if(ex_name.equals(name)){
                    count++;
                }
            }
        }
        return count;
    }
    //output -1 if file doesn't exist
    public int repsSum(String name) throws FileNotFoundException{
        String ex_name;
        int reps2 = 0;
        int reps_sum = 0;
        int time2 = 0;
        int count = 0;
        
        File f = new File("textfiles/exerciseData" + OnlyGainz.userinfo[3] + ".txt");
        try (Scanner input = new Scanner(f)) {
            while(input.hasNext()){
                ex_name = input.next();
                reps2 = input.nextInt();
                time2 = input.nextInt();
                if(ex_name.equals(name)){
                    count++;
                    reps_sum += reps2;
                }
            }
        }
        if(count == 0)
            reps_sum = -1;
        return reps_sum;
        
    }
    
     public int timeSum(String name) throws FileNotFoundException{
        String ex_name;
        int reps2 = 0;//holds the reps ariable
        int time_sum = 0;//holds the sum of all the time in seconds
        int time2 = 0;
        int count = 0;
        
        File f = new File("textfiles/exerciseData" + OnlyGainz.userinfo[3] + ".txt");
        try (Scanner input = new Scanner(f)) {
            while(input.hasNext()){
                ex_name = input.next();
                reps2 = input.nextInt();
                time2 = input.nextInt();
                if(ex_name.equals(name)){
                    count++;
                    time_sum += time2;
                }
            }
        }
        if(count == 0)
            time_sum = -1;
        return time_sum;
         
         
        
     }
}
