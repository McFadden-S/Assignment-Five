package CompanyMVC;

/* **********************************************************
 * Programmer:	McFadden
 * Class:	CS30S
 * 
 * Assignment:	Assignment Five MVC
 *
 * Description:	This class will act as the controller for the MVC
 *              structure I'm creating.
 * 
 * *************************************************************/
 
 // import files here as needed
 import java.util.ArrayList;


 public class Controller
 {  // begin class
 	
 	// *********** class constants **********
 	
 	
 	// ********** instance variable **********
 	
        private EmployeeGUI ui; //links controller to GUI
        ArrayList<Employee> employees = new ArrayList<>(); //creates a list of employees
        private Employee e; //variable used to hold new employee
        private String nl = System.lineSeparator(); //used in output formating to create new lines
     
 	// ********** constructors ***********
 	
        public Controller(){
            
        }//end of constructer
     
 	// ********** accessors **********
 	
    //*****************************************************
    // Purpose: Creates new employee based on what was entered in GUI
    // Interface: IN: first name, last name, city, position, salary
    // Returns: NA
    // *****************************************************
        protected void submitButtonClicked(String fn, String ln, String c, String p, int s){
            
        }//end of SubmitButtonClicked
        
 	// ********** mutators **********
 
 }  // end class