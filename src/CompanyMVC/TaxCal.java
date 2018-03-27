package CompanyMVC;

/* **********************************************************
 * Programmer:	McFadden
 * Class:	CS30S
 * 
 * Assignment:	Assignment Five MVC
 *
 * Description:	This class will handle calculation income tax for employees
 *
 * **************************************************************/
 
 // import files here as needed
 
 
 public class TaxCal
 {  // begin class
 	// *********** class variables **********
     
        private static int nextID = 1000; //next patient id number
        
 	// *********** class constants **********
        
 	//2D array for US tax and brackets
        private final static double[][] UStax = {{0, 9325, 0.10}, {9326, 37950, 0.15}, 
            {37951, 91900, 0.25}, {91901, 191650, 0.28}, {191651, 416700, 0.33}, 
            {416701, 418400, 0.35}, {418400, -1, 0.396}};
        //2D array for Canadian tax and brackets
        private final static double[][] CAtax = {{0, 46605, 0.15}, {46606, 93208, 0.205},
            {93209, 144489, 0.26}, {144490, 205842, 0.29}, {205843, -1, 0.33}}; 
        //2D array for Chinese tax and brackets
        private final static double[][] CHtax = {{0, 3691, 0.03}, {3692, 11072, 0.1},
            {11073, 22143, 0.2}, {22144, 86113, 0.25}, {86114, 135320, 0.3}, 
            {135321, 196829, 0.35}, {196830, -1, 0.45}};
 	
 	// ********** instance variable **********
 	
        private int salary = 0; //yearly salary
        private int id = 0; //tax cal id number number
        private String city; //city of employment
        
 	// ********** constructors ***********
 	
/*****************************************************
 Purpose: create a new Tax Calculator object with default values
 Interface: IN: None
							
 Returns: None
 *****************************************************/
        public TaxCal(){
            id = nextID++;
            
            city = "XX";//sets a default value for city
            
            salary = 0;//sets a default value for salary
        }//end of default constructor
        
/*****************************************************
 Purpose: create a new Tax Calculator object with initialized values
 Interface: IN: salary s: int
		city c: String	
							
 Returns: None
 *****************************************************/
        public TaxCal(int s,          //salary
                      String c){        //city
                                  
            id = nextID++; //sets id number for tax cal
            
            salary = s; //sets initalized value for salary
            city = c; //sets initalized value for city
        }//end of initialized constructor
        
 	// ********** accessors **********
 	
    //*****************************************************
    // Purpose: set salary of employee
    // Interface: IN: new next id number
    // Returns: na
    // *****************************************************
        public void setSalary(int salary) {
            this.salary = salary;
        }//end of setSalary
        
    //*****************************************************
    // Purpose: sets city of employee
    // Interface: IN: new next city
    // Returns: na
    // *****************************************************
        public void setCity(String city) {
            this.city = city;
        }//end of setCity
 	// ********** mutators **********
 
 }  // end class