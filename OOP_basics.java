// Just practising basic techniques on OOP  

public class theMain {
    

    public static void main(String[] args) {
        Animal Bob = new Animal("Cow");
        System.out.println(Bob.getType()); 
        System.out.println(Bob.getSize()); 

        
    }
    
} 

class Animal {
    // set initial variables here
    int size = 0; 
    private String theType;  // Rule of thumb, public methods, private variables

    // where input variables go
    public Animal(String theType) {
        this.theType = theType;
    } 

    // way to return value of variables
    public String getType() { 
        return theType;
    }

    public int getSize () {
        return size;
    }

}
// public class Chair extends Furniture {...}  // the extends bit allows inheritance
