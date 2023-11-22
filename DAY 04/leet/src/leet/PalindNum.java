package leet;

public class PalindNum {
	
	
	public static boolean PalinNum(int Num) {
			int temp=0;
			int num = Num;
			while(Num != 0)
			{
				temp += (Num % 10);
				temp = temp * 10;
				Num = Num /10;
				
			}
			temp /= 10;
			System.out.println(num );
			System.out.println(temp);
			if(num == temp) {
				return true;
				
			}
			else return false;
	}

	public static void main(String[] args) {
		
		System.out.println(PalinNum(121)); 
		
		
	}

}
