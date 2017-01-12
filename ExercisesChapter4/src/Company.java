
public class Company {
	/* Add a String variable with name companyName, 
	 * and another String variable with name location. 
	 */
	String companyName; 
	String location; 
	
	// Create a constructor that allows to create Company instances given a name and location.
	 public Company(String name, String companyLocation){
		 companyName = name; 
		 location = companyLocation;
	 }
	 
	 /* 4)	Create a boolean method isBelgian that returns true if the company’s location is “Belgium”, 
	  * and false if it is not.  
	  */
	 
	 public boolean isBelgian(){
		 return(location.equals("Belgium"));
	 }

}
