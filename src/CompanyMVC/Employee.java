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
     
        private static int nextID = 1000; //next employee id number
        
 	// *********** class constants **********
 	// ********** instance variable **********
 	
        private String firstName; //first name of employee
        private String lastName; //last name of employee
        private String city; //city of employment
        private String position; //position of employment
        
        private double salary = 0; //yearly salary
        private int id = 0; //employee number
        
        TaxCal tc;  //tax calculator for employee
        
 	// ********** constructors ***********
 /*****************************************************
 Purpose: create a new Employee object with default values
 Interface: IN: None
							
 Returns: None
 *****************************************************/
        public Employee(){
            id = nextID++; //sets employee number
            
            firstName = "John"; //sets a default value for first name
            lastName = "Doe"; //sets a default value for last name
            city = "XX";//sets a default value for city
            position = "XX";//sets a default value for position
            
            salary = 0;//sets a default value for salary
            
            tc = new TaxCal(); //creates default tax cal
            
        }//end of default constructor
        
/*****************************************************
 Purpose: create a new employee object with initialized values
 Interface: IN: firstName fn: String
		lastName ln: String
		city c: String
		position p: String
		salary s: double
							
 Returns: None
 *****************************************************/
        public Employee(String fn,       //first name
                        String ln,       //last name
                        String c,        //city
                        String p,        //position
                        double s){          //salary
            id = nextID++; //sets employee id for employee
            
            firstName = fn; //sets initalized value for first name
            lastName = ln;//sets initalized value for last name
            city = c; //sets initalized value for city
            position = p; //sets initalized value for position
            
            salary = s; //sets initalized value for salary
            
            tc = new TaxCal(s, c); //creates TaxCal with initalized values
            
        }//end of initialized constructor
        
 	// ********** accessors **********
        
    //*****************************************************
    // Purpose: gets first name of employee
    // Interface: IN: na
    // Returns: first name
    // *****************************************************
    public String getFirstName() {
        return firstName;
    }//end of get First Name
    
    //*****************************************************
    // Purpose: gets last name of employee
    // Interface: IN: na
    // Returns: last name
    // *****************************************************
    public String getLastName() {
        return lastName;
    }//end of Get last Name
    
    //*****************************************************
    // Purpose: gets city of employee
    // Interface: IN: na
    // Returns: city
    // *****************************************************
    public String getCity() {
        return city;
    }//end of getCity
    
    //*****************************************************
    // Purpose: gets position of employee
    // Interface: IN: na
    // Returns: position
    // *****************************************************
    public String getPosition() {
        return position;
    }//end of getPosition
    
    //*****************************************************
    // Purpose: gets salary of employee
    // Interface: IN: na
    // Returns: salary
    // *****************************************************
    public double getSalary() {
        return salary;
    }//end of getSalary
    
    //*****************************************************
    // Purpose: gets id of employee
    // Interface: IN: na
    // Returns: id
    // *****************************************************
    public int getId() {
        return id;
    }//end of getID
    
    //*****************************************************
    // Purpose: gets income tax for employee
    // Interface: IN: na
    // Returns: tax
    // *****************************************************
    public double getTax() {
        return tc.getTax();
    }//end of getID
    
    //*****************************************************
    // Purpose: gets the city name of employment
    // Interface: IN: na
    // Returns: city name
    // *****************************************************
    public String getCityName(){
        String cityName = "";
        
        if (city.toString().equals("NY")){
          cityName = "New York"; //sets city name
        }//end of if New York
        
        else if (city.toString().equals("SV")){
          cityName = "Silicon Valley";//sets city name
        }//end of if Silicon Vally
        
        else if (city.toString().equals("OT")){
          cityName = "Ottawa";//sets city name
        }//end of if Ottawa
        
        else if (city.toString().equals("BI")){
          cityName = "Beijing";//sets city name
        }//end of if Beijing
        
        return cityName;
    }//end of getCityName
    
    //*****************************************************
    // Purpose: gets the name of employee's position
    // Interface: IN: na
    // Returns: position name
    // *****************************************************
    public String getPositionName (){
        String Po = "";
        
        if (position.toString().equals("PW")){
            Po = "Plant Worker";//sets position name
        }//end of if position equals plant worker
        
        else if (position.toString().equals("RD")){
            Po = "R&D Scientist";//sets position name
        }//end of if position equals R&D Scientist
        
        else if (position.toString().equals("E")){
            Po = "Engineer";//sets position name
        }//end of if position equals Engineer
        
        else if (position.equals("CS")){
            Po = "Computer Scientist";//sets position name
        }//end of if position Computer Scientist
        
        else if (position.toString().equals("S")){
            Po = "Sales";//sets position name
        }//end of if position equals Sales
        
        else if (position.toString().equals("MA")){
            Po = "MA";//sets position name
        }//end of if position equals Manager
        
        else if (position.toString().equals("L")){
            Po = "Lawyer";//sets position name
        }//end of if position equals Lawyer
        
        else{
            Po = "Marketing"; //sets position name
        }//end of else position equals Marketing
        
        return Po;
    }//end of get PositionName
    
 	// ********** mutators **********
    
    //*****************************************************
    // Purpose: set first name of employee
    // Interface: IN: new first name
    // Returns: na
    // *****************************************************
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
        tc.setCity(city);
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
        tc.setSalary(salary);
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
        tc.setNextId(n);
     } // end setNextID
     
    //*****************************************************
    // Purpose: override the toString method
    // Interface: IN: na
    // Returns: formatted output
    // *****************************************************
     public String toString(){
         String strin = "Employee ID " + id + ", " + position + ", " + city + ", " + salary;
        return strin;
     }//end of toString
     
 }  // end class