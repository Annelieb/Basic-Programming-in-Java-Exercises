
public class Ex2Names {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"John", "Anna", "Bob", "Peter", "Helen"};
		String[] sequence = {"first", "second", "third", "fourth", "fith"};
		for ( int n = 0; n < 5; n++ ){
			System.out.println( "The name of the " + sequence[n] + " person is " + names[n] + "." );
		}
	}

}
