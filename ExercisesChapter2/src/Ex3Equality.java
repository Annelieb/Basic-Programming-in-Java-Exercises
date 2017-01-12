
public class Ex3Equality {
	public static void main(String[] args){
		double[] array1 = {1, 2, 3};
		double[] array2 = {3, 2, 1};
		String[] sequence = {"first", "second", "third", "fourth", "fith"};
		
		for(int n = 0; n<3; n++){
			boolean comp = array1[n] == array2[n];
			System.out.println("The " + sequence[n] + " element of the two arrays are equal: " + comp);
		}
	}
}
