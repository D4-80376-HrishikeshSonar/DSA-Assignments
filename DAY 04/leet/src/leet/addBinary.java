package leet;

public class addBinary {
	public static void addBinary(String a, String b) {
		
		StringBuilder sb = new StringBuilder();
		int i = a.length()-1;
		int j = b.length() - 1;
		int carry = 0;
		
		while(i>= 0 || j>= 0) {
			int sum = carry;
			if(i>= 0)
				sum += a.charAt(i) - '0';
			if(j>= 0)
				sum += b.charAt(j) - '0';
			carry = sum / 2;
			sb.append(sum%2);
			i--;
			j--;
		}
		if(carry != 0) {
			sb.append(carry);	
		}
		
		System.out.println(sb.reverse().toString()); 
		
	}
	

	public static void main(String[] args) {
		addBinary("1001","1");
	}

}
