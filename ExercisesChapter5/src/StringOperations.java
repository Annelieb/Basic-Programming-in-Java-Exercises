
public class StringOperations {
	public static String reverse(String word){
		String reversedWord = "";
		for(int i = word.length()-1; i >= 0; i-- ){
			reversedWord = reversedWord + word.charAt(i);
		}
		return reversedWord;
	}
	
	public static boolean isPallindrone(String word){
		return word.equals(reverse(word));
	}
	
	public static void main(String[] args){
		System.out.println(reverse("Laten we dit eens testen: lepel"));
		System.out.println(isPallindrone("lepel"));
		System.out.println(isPallindrone("Hakim"));
		
	}

}
