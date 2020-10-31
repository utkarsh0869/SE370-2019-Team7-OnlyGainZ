import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Dinner {
    
public HashMap<Integer, String> dinnerHM;

    public Dinner() {
        dinnerHM = new HashMap<Integer, String>();
        populateHashMap();
    }

    private void populateHashMap() {
        
        try
        {
            File myFile = new File("textfiles/dinner.txt");
            try (Scanner myReader = new Scanner(myFile)) {
                
                while (myReader.hasNextLine()) {
                    
                    String ii = myReader.nextLine();
                    Integer j = Integer.parseInt(ii);
                    String ss = myReader.nextLine();
                    dinnerHM.put(j, ss);
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
        return dinnerHM;
    }
    
    String returnRandomFoodDescriptionFromHashMap(int i){
        return dinnerHM.get(i);
    }
}