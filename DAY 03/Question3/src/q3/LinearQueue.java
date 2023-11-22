package q3;

public class LinearQueue {
	private  int front,rear;
	private  int size;
	private int [] arr;
	
	public LinearQueue(int Size) {
		size = Size;
		arr = new int[Size];
		front = rear = 0;
	
	}
	
	public void push(int value) {
		arr[rear] = value;
		rear++;
	}
	public void pop() {
		front++;
		
	}
	
	public int peek() {
		
		return arr[front];
	}
	
	public boolean isEmpty() {
		return rear == front;
	}
	public boolean isFull() {
		return rear == size -1;
	}
	
	

	public void display() {
		for (int i = front; i<rear; i++) {
			System.out.println(arr[i]);
		}
	}
}
