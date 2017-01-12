
public class Recursion {

	static int factorial(int n){
		if(n == 0){
			return 1;
		} else {
			return n * factorial(n-1);
		}
	}
	public static void main(String[] args) {
		int[] numbers = {0, 1, 5, 10};
		for(int i=0;i<4;i++){
			System.out.println("The factorial of " + numbers[i] + " is " + factorial(numbers[i]));
		}
	}

}
