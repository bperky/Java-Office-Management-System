public class Person {
    public static String firstName;
    public static String lastName;


    public void setFirstName(String newFirstName){
        firstName = newFirstName;
    }

    public void setLastName(String newLastName){
        lastName = newLastName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getFirstName(){
        return firstName;
    }

}