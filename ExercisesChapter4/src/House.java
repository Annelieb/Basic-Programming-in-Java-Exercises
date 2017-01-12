
public class House {
	
	static int maxNumInhabitants; 
	Person[] inhabitants;
	
	public House(int mNI, Person[] arrayOfInhabitants){
		maxNumInhabitants = mNI;
		inhabitants = arrayOfInhabitants;
	}
	
	public void assessLivingConditions(){
		if(inhabitants.length < maxNumInhabitants){
			System.out.println("There is still room in the house.");
		} else if(inhabitants.length == maxNumInhabitants){
			System.out.println("The house is full.");
		} else {
			System.out.println("There are too many people living in this house!");
		}
	}
	
	public static void main(String[] args) {
		Person[] inhab1 = { new Person("Lonesome", 0)};
		Person[] inhab2 = { new Person("Hakim", 24), new Person("Annelies", 23)};
		Person[] inhab3 = { new Person("Hilde", 52), new Person("Luc", 59), new Person("Michiel", 20), new Person("Eline", 22), new Person("Wouter", 26), new Person("Leen", 24)};
		
		House lonelyHouse = new House(3, inhab1);
		House cosyStudio = new House(2, inhab2);
		House crowdedHouse = new House(5, inhab3);
		
		lonelyHouse.assessLivingConditions();
		cosyStudio.assessLivingConditions();
		crowdedHouse.assessLivingConditions();
	}
}
