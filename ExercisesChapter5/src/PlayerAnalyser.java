import java.util.Arrays;
public class PlayerAnalyser {
	
	public static int minGoalsScored(int[] nbGoalsScored){
		//Add code here
		Arrays.sort(nbGoalsScored);		
		System.out.println("The least amount of goals scored by this player was " + nbGoalsScored[0]);
		return(nbGoalsScored[1]);
	}
	
	public static int maxGoalsScored(int[] nbGoalsScored){
		//Add code here
		Arrays.sort(nbGoalsScored);
		System.out.println("The most amount of goals scored by this player was " + nbGoalsScored[nbGoalsScored.length-1]);
		return(nbGoalsScored[nbGoalsScored.length-1]);		
	}
	
	public static double meanGoalsScored(int[] nbGoalsScored){
		//Add code here
		double mean;
		double sum = 0;
		for(int i = 0; i< nbGoalsScored.length; i++){
			sum = sum + nbGoalsScored[i];
		}
		mean = sum/nbGoalsScored.length; 	
		
		System.out.println("The mean amount scored was " + mean);
		return(mean);
	}
	
	public static double medianGoalsScored(int[] nbGoalsScored){
		//Arrays.sort sorts a given list in ascending order
		Arrays.sort(nbGoalsScored);
		
		//Add code here
		double median;
		if (nbGoalsScored.length % 2 == 0){
			median = (nbGoalsScored[(nbGoalsScored.length /2) -1] + nbGoalsScored[(nbGoalsScored.length /2)] )/2;
		} else {
			median = nbGoalsScored[(nbGoalsScored.length/2) -1];
		}
		System.out.println("The median amount scored was " + median); 
		return(median);		
	}

	public static void main(String[] args){
		//Test your functions here
		int[] goalsPlayer1 = {5,8,0,6,9}; // min = 0; max = 9; mean = 5.6; median = 6;
		int[] goalsPlayer2 = {8,4,5,2,1,1}; // min = 1; max = 8; mean = 3.5; median = 3;
		
		minGoalsScored(goalsPlayer1);
		maxGoalsScored(goalsPlayer1);
		meanGoalsScored(goalsPlayer1);
		medianGoalsScored(goalsPlayer1);
		
		minGoalsScored(goalsPlayer2);
		maxGoalsScored(goalsPlayer2);
		meanGoalsScored(goalsPlayer2);
		medianGoalsScored(goalsPlayer2);
	}
	
}
