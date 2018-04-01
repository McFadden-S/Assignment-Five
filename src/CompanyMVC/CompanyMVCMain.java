package CompanyMVC;

/********************************************************************
 * Programmer:      McFadden
 * Class:           CS30S
 *
 * Assignment:      Assignment Five
 * Program Name:    Company MVC
 *
 * Description:     This program will manage applications for job in
 *                  different positions and cities, when employees are added
 *                  they will be added to the list where they can be saved,
 *                  edited or removed
 *
 * Input:           Employee information in the GUI
 *
 * Output:          List of Employees and information on employees in GUI
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 import java.text.DecimalFormat;
 import java.io.*; 					// import file io libraries
 

public class CompanyMVCMain {  // begin class
    
    public static void main(String[] args) throws IOException{  // begin main
    
    // ********* declaration of constants **********
    // ********** declaration of variables **********
    // ********** Print output Banner ********** 	
    // ************************ get input **********************
    // ************************ processing ***************************
    
    EmployeeGUI employeeUI = new EmployeeGUI(); //creates new GUI object
    employeeUI.setVisible(true); //sets it to visible
    
    Controller controller = new Controller(); //creates new controleer object
    
    controller.setUI(employeeUI); //sets the ui controller interfaces with
    employeeUI.setController(controller); //sets controller that ui interfaces with
    
    try{
    employeeUI.con.getEmployeeList(); //loads saved list on open
    }//end of try
    catch(ArrayIndexOutOfBoundsException e){
    }//end of catch
    
    // ************************ print output ****************************
        // ******** closing message *********  
        System.out.println("end of processing.");
        
        // ***** close streams *****
    }  // end main
}  // end class
