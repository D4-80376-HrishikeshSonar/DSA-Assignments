package q2;

public class LinearSearch {

	public static void main(String[] args) {
		int arr [] = {11,23,34,45,54,68,91,76,81, 23, 34};
		
		
		int	key = 23;
		
//		for(int i = arr.length-1; i> 0; i--) {
//			if (arr[i] == key ) {
//				System.out.println("Element found at " +i + "th index" );
//				System.exit(0);
//			}
//			
//		}
		int i = arr.length-1 ;
		while(i > 0 ) {
			if (arr[i] == key ) {
			System.out.println("Element found at " +i + "th index" );
			break;
			}
			i--;
		}
		
		
		
		
		
	}

}
