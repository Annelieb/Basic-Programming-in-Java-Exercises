import java.text.DecimalFormat;

public class ex5 
{
	public static void goThroughArray(int[] myArray)
	{
		double ratio;
		DecimalFormat df = new DecimalFormat("0.##");
			for (int i = 1;i<myArray.length;i++)
			{
				try
				{
					if(myArray[i] == 0){throw new ArithmeticException();}
					if(myArray[i]%2==0)
					{
						ratio = (double) 10/myArray[i];
						System.out.println(df.format(ratio));
					}
					else
					{
						System.out.println("The number "+myArray[i]+" is odd.");
					}
				}
				catch(ArithmeticException e)
				{
					System.out.println("You divided by zero.");
					continue;
				}
			}

	}
	public static void main(String [] args)
	{
		int [] myArray={2,6,8,1,9,0,10,23,7,5,3};
		goThroughArray(myArray);
		
	}
}
