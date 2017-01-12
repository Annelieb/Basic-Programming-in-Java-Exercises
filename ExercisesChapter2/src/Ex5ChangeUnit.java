
public class Ex5ChangeUnit {

		// Define the variables
		static double a = 1.8;
		static int b = 32;
		
		// Method for changing to Fahrenheit
		public static double changeToFahrenheit(double celsius){
			double F; 
			F = (int) (celsius*a)+b;
			return(F);
		}
	
		
		// Change F to C
		public static double changeToCelsius(double fahrenheit){
		
		double C = (fahrenheit-b)/a;
		return(C);
		}
		
		// Main method
		public static void main(String[] args) {
			double C = 200; 
			double F = 100;
			
			// Call methods
			double celsius = changeToCelsius(F); 
			double fahrenheit = changeToFahrenheit(C);
			
			// Print results
			System.out.println("celsius: "+celsius+"\nfahrenheit: "+fahrenheit);
			
	
		}
}
