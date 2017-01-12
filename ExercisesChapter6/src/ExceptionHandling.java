import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionHandling{

    static Scanner userinput = new Scanner(System.in);

    public static void main(String[] args){ 
        int age = checkAge();

        while (age == 0){
           System.out.println("Age should be an integer");
           userinput.nextLine();
           age = checkAge();}
           
        System.out.println("Your age is : " + age);         
    }

    public static int checkAge(){
        try{            
            System.out.print("Please Enter Your Age :");
            return userinput.nextInt();
        }catch(InputMismatchException e){
            return 0;
        }
    }
}
