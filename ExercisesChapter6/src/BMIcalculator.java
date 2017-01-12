import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.DecimalFormat;


	public class BMIcalculator
	{
		// Main method
		public static void main(String[] args){

			// calculate BMI
			double BMI = calculateBMI();
			DecimalFormat df = new DecimalFormat("0.##");
			System.out.println("Your BMI is " + df.format(BMI) +".");
			}
			
		// method calculating BMI
		public static double calculateBMI() throws InputMismatchException, ArithmeticException
		{
			double height = 0;
			double weight = 0;
			double BMI = 0;
			boolean correctHeight = false; 
			boolean correctWeight = false;
			
			while(correctHeight == false){
				try(Scanner scan = new Scanner(System.in)){
					System.out.println("Enter height in m: ");
					height = scan.nextDouble();
					if (height<=0||height>3){
						throw new ArithmeticException();
					} else {
					correctHeight = true;
					System.out.println(correctHeight);
					
					}
										
				} catch(InputMismatchException im){
					System.out.println("Input is of the wrong type!");
					correctHeight = false;
					continue;
				} catch(ArithmeticException ae){
					System.out.println("Input is either negative or too large!");
					correctHeight = false;
					continue;
				} 
				
			}
			
			while(correctWeight == false){
				try(Scanner scan = new Scanner(System.in)){
					System.out.println("Enter weight in m: ");
					weight = scan.nextDouble();
					
					if (weight<=0||weight>300){
						throw new ArithmeticException();
					}else{					
					correctWeight = true;
					System.out.println(correctWeight);
					}
										
				} catch(InputMismatchException im){
					System.out.println("Input is of the wrong type!");
					correctWeight = false;
				} catch(ArithmeticException ae){
					System.out.println("Input is either negative or too large!");
					correctWeight = false;
				} 
				}
			
			BMI = weight/(height*height);
			return BMI;
			}
		}



	

