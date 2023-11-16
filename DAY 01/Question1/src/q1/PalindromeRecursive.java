package q1;

import java.util.Scanner;

public class PalindromeRecursive {
	
	
	public static boolean palindromeRecur(String word, int l, int r) {
		if(l>r)
			return true;
		else 
		{
			if(word.charAt(l) != word.charAt(r))
				return false;
			else 
				return palindromeRecur(word, ++l, --r);
		}
		

	
	}

public static void main(String [] args) {
	
	Scanner sc= new Scanner(System.in);
	String word ;
	System.out.println("Enter a word: ");
	word = sc.next().toLowerCase();
	int l = 0, r = word.length()-1;
	
	System.out.println(palindromeRecur(word, l,r));
}
}