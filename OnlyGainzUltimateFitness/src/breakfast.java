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
                    
                    String ii = myReader.nextLine();//1
                    Integer j = Integer.parseInt(ii);//j = 1,2
                    String ss = myReader.nextLine();//ss = Healthy Egg Muffin Cups. Serving Size: 2 egg muffins. 96 calories., 
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
