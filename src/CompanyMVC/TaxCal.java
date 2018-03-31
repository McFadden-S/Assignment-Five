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
        private final static double[][] UStax = {{0, 0.10}, {9326, 0.15}, 
            {37951, 0.25}, {91901, 0.28}, {191651, 0.33}, 
            {416701, 0.35}, {418400, 0.396}};
        //2D array for Canadian tax and brackets
        private final static double[][] CAtax = {{0, 0.15}, {46606, 0.205},
            {93209, 0.26}, {144490, 0.29}, {205843, 0.33}}; 
        //2D array for Chinese tax and brackets
        private final static double[][] CHtax = {{0, 0.03}, {3692, 0.1},
            {11073, 0.2}, {22144, 0.25}, {86114, 0.3}, 
            {135321, 0.35}, {196830, 0.45}};
 	
 	// ********** instance variable **********
 	
        private int id = 0; //tax cal id number number
        private int index = 0; //holds index for array
        
        private String city; //city of employment
        
        private double[][] tax; //holds current tax system
        private double taxCost; //holds current tax cost
        private double salary = 0; //yearly salary
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
 Interface: IN: salary s: double
		city c: String	
							
 Returns: None
 *****************************************************/
        public TaxCal(double s,          //salary
                      String c){        //city
                                  
            id = nextID++; //sets id number for tax cal
            
            salary = s; //sets initalized value for salary
            city = c; //sets initalized value for city
        }//end of initialized constructor
        
 	// ********** accessors **********
 	
    //*****************************************************
    // Purpose: gets the income tax the employee needs to pay
    // Interface: IN: na
    // Returns: tax
    // *****************************************************
        public double getTax(){
            
            setTax(); //sets which tax system
            getIndex(); //sets starting index
        
        taxCost = CalTax(salary, index); //calculates tax cost
        
        return taxCost;
        }//end of get tax
        
    //*****************************************************
    // Purpose: gets the index for tax
    // Interface: IN: na
    // Returns: index
    // *****************************************************
        public int getIndex(){
            
        //sets index to the length of string -1 since indexs start at zero
        index = (tax.length-1); 
        
        //reduces index till its in the right bracket
        for(double i = salary; i<=tax[index][0]; index--){  
        }//end of for loop
        
        return index;
        }//end of get Index
        
    //*****************************************************
    // Purpose: calculates the income tax
    // Interface: IN: salary and index
    // Returns: income tax
    // *****************************************************
        private double CalTax(double sal, int n){
            if (n<=0){
            return 0; //returns tax cost 0 since in bottom bracket
        }//end of if
        else{
            //returns tax cost of money in current bracket plus a return to
            //calculate the next bracket down
            return((sal-tax[n][0])*tax[n][1] + CalTax(tax[n][0], n-1));
        }//end of else
        }//end of CalTax
          
 	// ********** mutators **********
        
    //*****************************************************
    // Purpose: set salary of employee
    // Interface: IN: new next id number
    // Returns: na
    // *****************************************************
        public void setSalary(double salary) {
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
        
    //*****************************************************
    // Purpose: sets the tax for calculation
    // Interface: IN: None
    // Returns: None
    // *****************************************************
        private void setTax(){
            if (city.equals("OT")){
                tax = CAtax; //sets tax to canadian tax
            }//end of if ottawa
            else if (city.equals("BI")){
                tax = CHtax; //sets tax to chinese tax
            }//end of else if beijing
            else{
                tax = UStax;
            }//end of else 
        }//end of set Tax
    
    //*****************************************************
    // Purpose: set next id to last loaded employee/taxcal id + 1
    // Interface: IN: new next id number
    // Returns: na
    // *****************************************************
     public void setNextId(int n){
        nextID = n;
     } // end setNextID
     
 }  // end class