package q2;

public class DescInsertSort {
	
	public static void DescInsertionSort(int []arr, int length) {
		for(int i = 1; i<length;i++) {
			int temp = arr[i];
			int j ;
			for(j= i-1; j>=0 && arr[j] < temp  ; j--) {
				arr[j+1] = arr[j];
			}
			arr[j+1] = temp;
		}
	
	}
	
	public static void main(String[] args) {
		int [] arr = {6,9,4,2,1,2,3};

		
		DescInsertionSort(arr, arr.length);
		
		for (int i : arr) {
			System.out.println(i);
		}
	}	
		
	}


