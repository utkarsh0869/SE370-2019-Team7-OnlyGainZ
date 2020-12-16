/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Tips {

    public ArrayList<String> tipsArray;
    
    public Tips() {
        tipsArray = new ArrayList<String>();
        populateArrayList();
    }

    public ArrayList<String> getTipsArray() {
        return tipsArray;
    }

    public void setTipsArray(ArrayList<String> tipsArray) {
        this.tipsArray = tipsArray;
    }
    
    
    String returnRandomTipsFromArrayList(int x){
        String s = tipsArray.get(x);
        return s;
    }
    
    public void populateArrayList()
    {
        try
        {
            File myFile = new File("textfiles/healthTips.txt");
            try (Scanner myReader = new Scanner(myFile)) {
                
                while (myReader.hasNextLine()) {
                    String ss = myReader.nextLine();
                    tipsArray.add(ss);
                }
                Collections.shuffle(tipsArray); // randomize the order of the ArrayList
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
               
}
