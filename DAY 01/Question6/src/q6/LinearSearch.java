package q6;

public class LinearSearch {

	public static void main(String[] args) {
		int arr [] = {11,23,34,23,23,45,54,23,68,91,76,81, 23, 34};
		int	key = 23;
		int occurence = 1;
		
		int count = 1;
		
		
	for(int i = 0; i< arr.length; i++) {
		if (arr[i] == key ) {
			if(count == occurence)
				{
				System.out.println("3rd occurence at "+i+ "th place");
				System.exit(0);
				};
				count++;
		}
		}
		
		
	}

}
