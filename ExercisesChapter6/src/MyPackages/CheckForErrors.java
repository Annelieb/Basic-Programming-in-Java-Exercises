package MyPackages;

public class CheckForErrors {
	public static void main(String args []){
		int[] numbers = {1,2,3,4,5};
		for(int i = 0 ; i <= 5 ; i++){
			System.out.println(numbers[i]+" squared equals " + power(numbers[i]), 2));			
		}
	}
	public static int power(int n, int a){
		int tmp = n; int j = 0;
		while(j < a){
			tmp = tmp*n;
			j++;
		}
		return tmp;
	}

}
