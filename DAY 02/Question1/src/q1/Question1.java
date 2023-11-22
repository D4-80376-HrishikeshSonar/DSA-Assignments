package q1;

public class Question1 {

	
	public static void insertionSort(int[] arr, int length) {
//		int count = 0;
//		for(int i = 1; i<length; i++) {
//			int temp = arr[i];
//			int j = i-1;
//			while(j>=0 && arr[j] > temp) {
//				arr[j+1] = arr[j];
//				j--;
//				count++;
//				
//			};
//			arr[j+1]=temp;
		
		for(int i =1 ; i< length; i++) {
			int temp = arr[i];
			int j;
			for(j= i-1; j>= 0 && arr[j] > temp;j-- ) {
				arr[j+1] = arr[j];
			}
			arr[j+1] = temp;
			
		};
//		System.out.println("No of comparisons "+count);
		
		
	}
	
	public static void main(String[] args) {
		
		int [] arr = {6,9,4,2,1,2,3};

		
		insertionSort(arr, arr.length);
		
		for (int i : arr) {
			System.out.println(i);
		}
	}


}
