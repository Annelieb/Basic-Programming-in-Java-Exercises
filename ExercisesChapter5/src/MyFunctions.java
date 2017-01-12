
public class MyFunctions {
	public static int f(int x){
		int total;
		int i;
		if(x<0){
			return(-1);
		} else {
			total = 1;
			i = 1;
			while(i<x){
				i++;
				total = total*i;						
			}
			return(total);
		}
				
	}
	
	public static int[] flist(int y){
		int[] result = new int[y];
		for(int i = 0; i<y; i++){
			result[i] = f(i);			
		}
		return result;
	}
	
	public static void main(String[] args){
		for(int i = 0; i<5; i++){
		System.out.println(flist(5)[i]);
		}
	}

}

