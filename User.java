import java.io.*;

public class User implements Serializable{
    
    private String fName;
    private String lName;
    private String username;
    private String password; // needs to be encrypted
    private String gender;
    private int age;
    private int height; // height is in cm  
    private int weight;  // weight is in lbs
    private int yrOfExperience; // years of experience working out

    public User(String fName, String lName, String username, String password, String gender, int age, int height, int weight, int yrOfExperience) {
        this.fName = fName;
        this.lName = lName;
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.yrOfExperience = yrOfExperience;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getYrOfExperience() {
        return yrOfExperience;
    }

    public void setYrOfExperience(int yrOfExperience) {
        this.yrOfExperience = yrOfExperience;
    }
    
    
}
