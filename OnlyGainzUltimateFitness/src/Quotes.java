
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
public class Quotes {

    public HashMap<Integer, String> quotesHM;
    
    public Quotes() {
        quotesHM = new HashMap<Integer, String>();
        populateHashMap();
    }
    
    public HashMap<Integer, String> getHashMap(){
        return quotesHM;
    }
    
    String returnRandomQuotesFromHashMap(){
        Random r = new Random();
        int i = r.nextInt(20 - 1 + 1) + 1;
        return quotesHM.get(i);
    }
    
    public void populateHashMap()
    {
        try
        {
            
            File myFile = new File("textfiles/quotes.txt");
            try (Scanner myReader = new Scanner(myFile)) {
                
                while (myReader.hasNextLine()) {
                    
                    String ii = myReader.nextLine();
                    Integer j = Integer.parseInt(ii);
                    String ss = myReader.nextLine();
                    quotesHM.put(j, ss);
                    
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