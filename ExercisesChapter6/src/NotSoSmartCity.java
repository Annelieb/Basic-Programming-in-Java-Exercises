public class NotSoSmartCity {

	private String[] inhabitantNames;
	private int nbInhabitants;
	private double totalAmountOfMoney;
	private String name;	

	public NotSoSmartCity(String name, double totalAmountOfMoney, String[] inhabitantNames){
		this.name = name;
		if(this.name == null){
			this.name = "UNKNOWN";
		}
		this.nbInhabitants = inhabitantNames.length;
		this.totalAmountOfMoney = totalAmountOfMoney;
		this.inhabitantNames = inhabitantNames;
		if(this.inhabitantNames == null){
			this.inhabitantNames = new String[]{}; 			
		}
	}	

	public void printCityNameForEachInhabitant(){
		for(int i = nbInhabitants; i!=0;i--){
			System.out.println(this.name);
		}
	}	

	public double getAverageAmountOfMoney(){
		return totalAmountOfMoney/nbInhabitants;
	}


	public static String babyNameGenerator(String beginning, int lettersToAdd){
			if(lettersToAdd < 0){
				throw new IllegalArgumentException("The number of letters to add cannot be negative.");
				}
			else if(0 == lettersToAdd){
				return beginning;
				}
			else{
				return babyNameGenerator(beginning+getRandomLetter(), lettersToAdd -1);
				}
	}

	private static char getRandomLetter(){
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		return alphabet.charAt((int) (Math.random()*alphabet.length()));
	}

	public void printInhabitantNames(){
		for(int i=0; i < nbInhabitants; i++){
			System.out.println(inhabitantNames[i]);
		}
	}

	public static void main(String[] args){
		//Your code here
		
		//StackOverflowError: Because the lettersToAdd should not be < 0!!! This will create a continuous call of the babyNameGenerator function!
		//System.out.println(NotSoSmartCity.babyNameGenerator("Jo", -1));

		//ArrayIndexOutOfBoundsException
		//NotSoSmartCity city1 = new NotSoSmartCity("DumboTown", 4000.5, new String[]{"Ralph", "Stephen", "Tutu", "Alex"});
		//city1.printInhabitantNames();


		//Nullpointer exception
		//NotSoSmartCity city2 = new NotSoSmartCity("DumboTown", 10, 4000.5, null);
		//city2.printInhabitantNames();


		//Infinite loop
		//NotSoSmartCity city3 = new NotSoSmartCity("DumboTown", -1, 4000.5, new String[]{"Ralph", "Stephen", "Tutu", "Alex"});
		//city3.printCityNameForEachInhabitant();
	}

	
}

