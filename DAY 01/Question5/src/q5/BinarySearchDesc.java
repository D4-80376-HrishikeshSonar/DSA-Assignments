package q5;

public class BinarySearchDesc {
	
	
	
	public static  void BinarySearchDesc(int arr[], int key)
	{
		int l =0, r = arr.length-1;
		int mid;
		
		
		while(l<=r)
		{
			mid = (l+r)/2;
			
			if(arr[mid] == key) {
				System.out.println("ele found at" + mid);
				System.exit(0);
			}
			else if(arr[mid] > key)
			{
				l = mid + 1;
			}
			else if(arr[mid] < key) 
			{
				r = mid - 1;
			}
			

		}
		
	}
	
	public static void main(String[] args) {
		int a[] = {9,8,7,6,5,4,3,2,1};
		BinarySearchDesc(a, 4);
		
	}

}
