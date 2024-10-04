
/*

 * Create a class called Employee that includes three pieces of information as instance variables
 * - a first name (type String), a last name (type String) and a monthly salary (double).
 * Your class should have a constructor that initializes the three instance variables.
 * Provide a set and a get method for each instance variable.
 * If the monthly salary is not positive, set it to 0.0.
 * Write a test application named EmployeeTest that demonstrates class Employee's capabilities.
 * Create two Employee objects and display each object's yearly salary.
 * Then give each Employee a 10% raise and display each Employee's yearly salary again.
 */
 class Employee 
{
	private String firstName; // instance variable that stores the first name
	private String lastName; // instance variable that stores the last name
	private double monthlySalary; // instance variable
	
	// constructor initializes firstName, lastName and monthlySalary with String and double supplied as argument
	public Employee (String fname, String lname, double msalary)
	{
		firstName = fname; // initialize firstName
		lastName = lname; // initialize lastName
		monthlySalary = msalary; // initialize monthlySalary
		
		// if the monthly salary is not positive, set it to 0.0.
		if (msalary < 0.0)
			monthlySalary = 0.0;
	} // end constructor
	
	// method to set the first name
	public void setFirstName (String fname)
	{
		firstName = fname;	// store the first name
		
	} // end method setFirstName
	
	// method to retrieve first name
	public String getFirstName ()
	{
		return firstName;
	} // end method getFirstName
	
	// method to set the last name
	public void setLastName (String lname)
	{
		lastName = lname;	// store the last name
	} // end method setLastName
	
	// method to retrieve last name
	public String getLastName ()
	{
		return lastName;
	} // end method getLastName
	
	// method to set the monthly salary
	public void setMonthlySalary (double msalary)
	{
		monthlySalary = msalary;	// store the monthly salary
		

	} // end method setMonthlySalary
	
	// method to retrieve monthly salary
	public double getMonthlySalary ()
	{
		return monthlySalary;
	} // end method getMonthlySalary
	
	// method to retrieve yearly salary
	public double getYearlySalary()
	{
		double yearlySalary = monthlySalary * 12;
		return yearlySalary;
	} // end method getYearlySalary
	
	// method to retrieve yearly salary after giving 10% raise
	public double getRaiseSalary()
	{
		double raise =  monthlySalary * 0.1 ;
		double raiseSalary = ( monthlySalary + raise ) * 12;
		return raiseSalary;
	} // end method getRaiseSalary
	
} // end class Employee

public class EmployeeTest 
{
	// main method begins program execution
	public static void main(String[] args) 
	{
		Employee emp1 = new Employee( "John", "Smith", 5000.00 );
		Employee emp2 = new Employee( "Jane", "Doe", 8000.00 );
		
		// display employee's initial yearly salary
		System.out.printf( "Yearly salary of %s %s: %.2f\n", emp1.getFirstName(), emp1.getLastName(), emp1.getYearlySalary() );
		System.out.printf( "Yearly salary of %s %s: %.2f\n", emp2.getFirstName(), emp2.getLastName(), emp2.getYearlySalary() );
		
		System.out.println();
		
		// display employee's salary after giving 10% raise
		System.out.println( "***** Giving 10% raise for each employee *****" );
		System.out.printf( "Yearly salary of %s %s: %.2f\n", emp1.getFirstName(), emp1.getLastName(), emp1.getRaiseSalary() );
		System.out.printf( "Yearly salary of %s %s: %.2f\n", emp2.getFirstName(), emp2.getLastName(), emp2.getRaiseSalary() );
	} // end method main
} // end EmployeeTest



/* Output:
 * Yearly salary of John Smith: 60000.00
 * Yearly salary of Jane Doe: 96000.00
 * 
 * ***** Giving 10% raise for each employee *****
 * Yearly salary of John Smith: 66000.00
 * Yearly salary of Jane Doe: 105600.00
 * 
 */ 