import java.util.ArrayList;

public class OutOfMemoryErrorExercise {
	public static void main(String[] args) {
		ArrayList<String> myStrings=new ArrayList<String>();
		int i=1;
		try{
			while(i>0)
			{
				myStrings.add("String number:"+ i);
				myStrings.add("String number:"+ i);
			}
		}
	
		catch(OutOfMemoryError e)
		{
			System.out.println("Memory is full!");
		}
	}
}

