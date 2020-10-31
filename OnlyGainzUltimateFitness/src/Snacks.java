
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Snacks {
public HashMap<Integer, String> snacksHM;

    public Snacks() {
        snacksHM = new HashMap<Integer, String>();
        populateHashMap();
    }

    private void populateHashMap() {
        
        try
        {
            File myFile = new File("textfiles/snacks.txt");
            try (Scanner myReader = new Scanner(myFile)) {
                
                while (myReader.hasNextLine()) {
                    
                    String ii = myReader.nextLine();
                    Integer j = Integer.parseInt(ii);
                    String ss = myReader.nextLine();
                    snacksHM.put(j, ss);
                }
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    public HashMap<Integer, String> getHashMap(){
        return snacksHM;
    }
    
    String returnRandomFoodDescriptionFromHashMap(int i){
        return snacksHM.get(i);
    }
    
    
    
}

