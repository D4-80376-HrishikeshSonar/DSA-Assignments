package q1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String word ;
		System.out.println("Enter a word: ");
		word = sc.next().toLowerCase();
		
		int l = 0, r = word.length()-1;
		
		while(l<=r)
		{
			if(word.charAt(l) != word.charAt(r))
			{
				System.out.println("Not a palindrome");
				
				System.exit(0);
			}
			l++;
			r--;
			
			
		}
		System.out.println("A palindrome.");
		
		
	}

}
