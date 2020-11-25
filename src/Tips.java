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

    public HashMap<Integer, String> tipsHM;
    
    public Tips() {
        tipsHM = new HashMap<Integer, String>();
        populateHashMap();
    }
    
    public HashMap<Integer, String> getHashMap(){
        return tipsHM;
    }
    
    String returnRandomTipsFromHashMap(){
        String s = "";
        //Collections.shuffle(Arrays.asList(tipsHM));
        //List keys = new ArrayList(tipsHM.keySet());
        //Collections.shuffle(keys);
        
        for(int i = 1; i < 6; i++) {
            //Collections.shuffle(Arrays.asList(tipsHM));
            Random r = new Random();
            int j = r.nextInt(25 + 1 -1) + 1;
            s += i + ": " + tipsHM.get(j) + "\n";
        }
        return s;
    }
    
    public void populateHashMap()
    {
        try
        {
            
            File myFile = new File("textfiles/healthTips.txt");
            try (Scanner myReader = new Scanner(myFile)) {
                
                while (myReader.hasNextLine()) {
                    String ii = myReader.nextLine();
                    Integer j = Integer.parseInt(ii);
                    String ss = myReader.nextLine();
                    tipsHM.put(j, ss);
                }
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
               
}
