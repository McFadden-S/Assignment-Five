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
 	
 	// ********** mutators **********
 
 }  // end class