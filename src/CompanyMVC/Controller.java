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
        protected void submitButtonClicked(String fn, String ln, String c, String p, double s){
            e = new Employee(fn, ln, c, p, s); //creates new employee with data entered
            employees.add(e); //adds new employee to list
            ui.employeeListModel.addElement(e); //adds new employee to list on GUI
        }//end of SubmitButtonClicked
        
        protected void loadListButtonClicked(Employee e){
            int nid = e.getId();
            e.setNextId(++nid);
        }
        
        
 	// ********** mutators **********
    //*****************************************************
    // Purpose: sets the ui which the controller interacts with 
    // Interface: IN: UI
    // Returns: NA
    // *****************************************************
        public void setUI (EmployeeGUI UI){
            this.ui = UI;
        }//end of setUI
 }  // end class