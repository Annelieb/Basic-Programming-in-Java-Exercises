
public class Patterns {
	public static void upperTriangle(int num){
		
		while (num > 0){
			for(int i = 0; i < num; i++){
			System.out.print("*");
			}
			System.out.print("\n");
			num--;
		}
	}
	
	public static void lowerTriangle(int num){
		int star = 1;
		while (star <= num){
			int space = num-star;
			for(int i = 0; i < space; i++){
			System.out.print(" ");
			}
			for(int i = 0; i < star; i++){
				System.out.print("*");
		}
			System.out.print("\n");
			star++;
		}
	}
	
	public static void diamond(int num){
		int star = 1;
		int space = num-1;
		int i = 1;
		for(int n = 1; n < num*2; n++){
			for(int sp = 0; sp<space; sp++){
				System.out.print(" ");
			}
			for(int st = 0; st<star; st++){
				System.out.print("*");
			}
			if(n>=num){
				i = -1;
			}
			star = star + (2*i);
			space = space - i;
			System.out.print("\n");
			
		}
	}

	public static void main(String[] args) {
		upperTriangle(4);
		lowerTriangle(5);
		diamond(6);

	}

}
