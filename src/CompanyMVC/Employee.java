package CompanyMVC;

/* **********************************************************
 * Programmer:	McFadden
 * Class:	CS30S
 * 
 * Assignment:	Assignment Five MVC
 *
 * Description: This class will repersent the employee of the company
 *              this class will act as the model in the MVC structure of this
 *              program
 * **************************************************************/
 
 // import files here as needed
 import java.io.Serializable;
 

 public class Employee implements Serializable
 {  // begin class
 	// *********** class variables **********
     
        private static int nextID = 1000; //next patient id number
        
 	// *********** class constants **********
 	// ********** instance variable **********
 	
        private String firstName; //first name of employee
        private String lastName; //last name of employee
        private String city; //city of employment
        private String position; //position of employment
        
        private int salary = 0; //yearly salary
        private int id = 0; //employee number
     
 	// ********** constructors ***********
 /*****************************************************
 Purpose: create a new Employee object with default values
 Interface: IN: None
							
 Returns: None
 *****************************************************/
        public Employee(){
            id = nextID++;
            
            firstName = "John"; //sets a default value for first name
            lastName = "Doe"; //sets a default value for last name
            city = "XX";//sets a default value for city
            position = "XX";//sets a default value for position
            
            salary = 0;//sets a default value for salary
        }//end of default constructor
        
/*****************************************************
 Purpose: create a new employee object with initialized values
 Interface: IN: firstName fn: String
		lastName ln: String
		city c: String
		position p: String
		salary s: int
							
 Returns: None
 *****************************************************/
        public Employee(String fn,       //first name
                        String ln,       //last name
                        String c,        //city
                        String p,        //position
                        int s){          //salary
            id = nextID++;
            
            firstName = fn; //sets initalized value for first name
            lastName = ln;//sets initalized value for last name
            city = c; //sets initalized value for city
            position = p; //sets initalized value for position
            
            salary = s; //sets initalized value for salary
        }//end of initialized constructor
        
 	// ********** accessors **********

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }//end of setFirstName
    
     //*****************************************************
    // Purpose: set last name of employee
    // Interface: IN: new last name
    // Returns: na
    // *****************************************************
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }//end of setLastName
    
    //*****************************************************
    // Purpose: sets city of employee
    // Interface: IN: new next city
    // Returns: na
    // *****************************************************
    public void setCity(String city) {
        this.city = city;
    }//end of setCity
    
    //*****************************************************
    // Purpose: set position of employee
    // Interface: IN: new position
    // Returns: na
    // *****************************************************
    public void setPosition(String position) {
        this.position = position;
    }//end of setPosition
    
    //*****************************************************
    // Purpose: set salary of employee
    // Interface: IN: new next id number
    // Returns: na
    // *****************************************************
    public void setSalary(int salary) {
        this.salary = salary;
    }//end of setSalary

    //*****************************************************
    // Purpose: set id 
    // Interface: IN: new id number
    // Returns: na
    // *****************************************************
    public void setId(int id) {
        this.id = id;
    }//end of setId
    
    //*****************************************************
    // Purpose: set next id to last loaded employee id + 1
    // Interface: IN: new next id number
    // Returns: na
    // *****************************************************
     public void setNextId(int n){
        nextID = n;
     } // end setNextID
 	// ********** mutators **********

    
 
 }  // end class