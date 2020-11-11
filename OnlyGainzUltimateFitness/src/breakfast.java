import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class breakfast {
    
    public HashMap<Integer, String> breakfastHM;

    public breakfast() {
        breakfastHM = new HashMap<Integer, String>();
        populateHashMap();
    }

    private void populateHashMap() {
        
        try
        {
            File myFile = new File("textfiles/breakfast.txt");
            try (Scanner myReader = new Scanner(myFile)) {
                
                while (myReader.hasNextLine()) {
                    
                    String ii = myReader.nextLine();
                    Integer j = Integer.parseInt(ii);
                    String ss = myReader.nextLine();
                    breakfastHM.put(j, ss);
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
        return breakfastHM;
    }
    
    String returnRandomFoodDescriptionFromHashMap(int i){
        return breakfastHM.get(i);
    }
    
    
    
}
