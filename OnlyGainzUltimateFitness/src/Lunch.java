import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Lunch {
    
public HashMap<Integer, String> lunchHM;

    public Lunch() {
        lunchHM = new HashMap<Integer, String>();
        populateHashMap();
    }

    private void populateHashMap() {
        
        try
        {
            File myFile = new File("textfiles/lunch.txt");
            try (Scanner myReader = new Scanner(myFile)) {
                
                while (myReader.hasNextLine()) {
                    
                    String ii = myReader.nextLine();
                    Integer j = Integer.parseInt(ii);
                    String ss = myReader.nextLine();
                    lunchHM.put(j, ss);
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
        return lunchHM;
    }
    
    String returnRandomFoodDescriptionFromHashMap(int i){
        return lunchHM.get(i);
    }
    
    
    
}
