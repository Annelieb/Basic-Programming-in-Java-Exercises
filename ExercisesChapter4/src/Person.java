
public class Person {
	// Describing variables
	String name; 
	int age; 
	Person spouse; 
	
	public Person(String personName, int personAge){
		name = personName;
		age = personAge; 	
	}
	
	public static void marry(Person person1, Person person2){
		person1.spouse = person2;
		person2.spouse = person1;
	}
	
	public Person createClone(){
		Person clone = new Person(name, age);
		Person clonedSpouse = new Person(spouse.name, spouse.age);
		marry(clone, clonedSpouse);
		return(clone);
	}
	
	public static void main(String[] args){
		Person aSecondPerson = new Person("Annelies", 23);
		Person aFirstPerson = new Person("Hakim", 24);
		
		System.out.println(aFirstPerson.name + " and " + aSecondPerson.name + " are now created.");
		System.out.println("The marrital status of " + aFirstPerson.name + " is " + aFirstPerson.spouse +".");
		System.out.println("The marrital status of " + aSecondPerson.name + " is " + aSecondPerson.spouse + ".");

		marry(aFirstPerson, aSecondPerson);
		
		System.out.println(aFirstPerson.name + " is now married with " + aFirstPerson.spouse.name + ".");
		System.out.println(aSecondPerson.name + " is now married with " + aSecondPerson.spouse.name + ".");
		
	}
	
}
