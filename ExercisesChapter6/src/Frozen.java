public class Frozen {

	public static void main (String [] args){
		
		int [] clientid = {1,2,3,4,5};
		String [] clientname = {"Anna", "Elsa", "Olaf", "Hans", "Kristoff"}; 
		double [] accountbalance = {1000, 5000, 9, 55, 23};		
		
		for(int i = 1; i<=5; i++)
		{
			try{
		 System.out.println(clientname[i]+" has "+accountbalance[i]+" dollars. \n");
		} catch(IndexOutOfBoundsException np){
			System.out.println("There is something wrong with the code."); 
			System.exit(0);
		}
		}
	}
}
