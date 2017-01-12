
public class Customer {
	// The name of the customer
	String name; 
	// The age of the customer
	int age; 
	
	/* Add a boolean variable with name isMarried. 
	 * This variable indicates if a customer is married or not. 
	 * Make sure this variable cannot be accessed from outside the class.
	 */
	private boolean isMarried; 
	
	/* Add an integer variable with name adultAge. 
	 * This variable contains the age, in years, a customer becomes an adult. 
	 * Enforce that this variable is 18 for all customers and that it cannot be changed.
	 */
	final static int adultAge = 18;
	
	/*	Create a constructor method that allows users of the Customer class to create Customer objects,
	 *  with a given name, age and marital status.
	 */
	public Customer(String customerName, int customerAge, boolean customerMaritalStatus){
		name = customerName; 
		age = customerAge; 
		isMarried = customerMaritalStatus;	
	}
	
	/* Add a Boolean method named isAdult that takes no parameters. 
	 * The method should return true if the Customer is an adult, and false if the Customer is not.
	 */
	public boolean isAdult(){
		return(age>=adultAge);
	}
	
	/* Add a main-method to the class, in which you create a Customer object with name myFirstCustomer. 
	 * This customer should have as name “Maria”, age 19 and marital status false.
	 */
	public static void main(String[] args){
		Customer myFirstCustomer = new Customer("Maria", 19, false);
		System.out.println(myFirstCustomer.isAdult());
	}
}
