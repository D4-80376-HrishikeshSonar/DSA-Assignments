package q1;

public class Question1 {

	public static void main(String[] args) {
		String word = "NITIN";
		
		StringBuilder word1 = new StringBuilder(word);
		StringBuilder word2 = new StringBuilder(word);

		
		
		word1.reverse() ;
		System.out.println(word2);
		System.out.println(word1);
		
		if(word1 == word2) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
		
	}

}
