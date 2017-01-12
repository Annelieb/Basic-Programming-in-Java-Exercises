
public class Ex7MeanOfFive {
	
	// method that calculates the mean
	public static float mean(float[] array){
		float sum = 0;
		for(int i = 0; i<5; i++){		
			sum = array[i] + sum;
		}
		float m = sum/5;
		return(m);
	}
	
	// calling the mean method in the main method
	public static void main(String[] args) {
		float[] numbers = {7f, 85f, 72f, 5f, 68f, 98f};
		float mean = mean(numbers);
		System.out.println(mean);
	
	}

}
