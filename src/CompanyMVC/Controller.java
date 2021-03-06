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
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
 import java.util.ArrayList;


 public class Controller
 {  // begin class
 	
 	// *********** class constants **********
 	
 	
 	// ********** instance variable **********
 	
        private EmployeeGUI ui; //links controller to GUI
        ArrayList<Employee> employees = new ArrayList<>(); //creates a list of employees
        private Employee e; //variable used to hold new employee
        private String nl = System.lineSeparator(); //used in output formating to create new lines
        
        //used to format output
        private DecimalFormat df1 = new DecimalFormat("$###,###,###,###,###.00");
        
 	// ********** constructors ***********
 	
    //*****************************************************
    // Purpose: constructure for controller object
    // Interface: IN: na
    // Returns: na
    // *****************************************************
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
    
    //*****************************************************
    // Purpose: updates employees ids have list has been loaded
    // Interface: IN: employee
    // Returns: none
    // *****************************************************
        protected void loadListButtonClicked(Employee e){
            int nid = e.getId(); //gets latest id/highest
            e.setNextId(++nid);// sets next id to 1+ latest id
        }//end of loadListButtonClicked
        
    //*****************************************************
    // Purpose: gets employees information
    // Interface: IN: index
    // Returns: string of information
    // *****************************************************
        protected String getEmployee(int n){
            String strin = "";
                //formats a string with the employee's information
            strin = "Name: " + (employees.get(n)).getFirstName() + " " + 
                    (employees.get(n)).getLastName() + nl;
            strin += "ID: " + (employees.get(n)).getId() + nl;
            strin += "City: " + (employees.get(n)).getCityName() + nl;
            strin += "Position: " + (employees.get(n)).getPositionName() + nl;
            strin += "Salary: " + df1.format((employees.get(n)).getSalary()) + nl;
            strin += "Income Tax: " + df1.format((employees.get(n)).getTax()) + nl;
            
            return strin;
        }//end of getEmployee
        
    //*****************************************************
    // Purpose: Saves employee list as a file
    // Interface: IN: NA
    // Returns: NA
    // *****************************************************
        protected void writeEmployeeList(){
            try{
                FileOutputStream fos = new FileOutputStream("Employees.tmp");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                
                //writes employees into file
                oos.writeObject(employees);
                oos.close();
            }//end of try
            catch (IOException e) {
                
            }//end of catch io exception 
        }//end of writePatientList
        
    //*****************************************************
    // Purpose: reads employee list for saved file 
    // Interface: IN: NA
    // Returns: NA
    // *****************************************************
        protected void getEmployeeList(){
            try{
                FileInputStream fis = new FileInputStream("Employees.tmp");
                ObjectInputStream ois = new ObjectInputStream(fis);
            
                try{
                    //reads employees into array
                    employees = (ArrayList<Employee>)ois.readObject();
                    
                }//end of try
                catch(ClassNotFoundException e){
                }//end of catch
            }//end of first try
            catch(IOException e){
            }//end of catch
            ui.loadEmployeeListModel(employees);
        }//end of getPatientList
        
 	// ********** mutators **********
    //*****************************************************
    // Purpose: sets the ui which the controller interacts with 
    // Interface: IN: UI
    // Returns: NA
    // *****************************************************
        public void setUI (EmployeeGUI UI){
            this.ui = UI;
        }//end of setUI
        
    //*****************************************************
    // Purpose: Edits employee information
    // Interface: IN: first name, last name, city, position, salary and index
    // Returns: NA
    // *****************************************************
        public void editEmployee(String fn, String ln, String c, String p, double s, int n){
            employees.get(n).setFirstName(fn); //sets new value for first name
            employees.get(n).setLastName(ln); //sets new value for last name
            employees.get(n).setCity(c); //sets new value for city
            employees.get(n).setPosition(p); //sets new value for position
            employees.get(n).setSalary(s); //sets new value for salary

            //assigns new employee to list
            ui.employeeListModel.setElementAt(employees.get(n), n);
        }//end editEmployee
        
 }  // end class