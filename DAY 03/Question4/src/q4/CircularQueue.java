package q4;

public class CircularQueue {
	private int front,rear, size;
	int arr[];
	int counter;
	
	public CircularQueue(int Siize) {
		front = rear = 0;
		size = Siize;
		arr = new int[size];
		counter =0;
	}
	
	public boolean isFull() {
		return counter == size;
	}
	
	public boolean isEmpty() {
		return counter == 0;
	}
	
	public void enqueue(int value)
	{
		if(isFull()) {
			System.out.println("Queue is empty...");	
		}
		else {
			arr[rear] =value;
			rear = (rear + 1) % size;
			counter++;
		}
	}
	
	public int dequeue()
	{
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
	
			int element = arr[front];
			front = (front + 1) % size;
			counter--;
			return element;
		
	}
	
	public void printQueue()
	{
		if(isEmpty()) {
			System.out.println("Queue is empty. ");
		}
		else {
			for(int i = 0; i< counter; i++) {
				System.out.println(arr[(front + i) % size ]);
			}
		}
	}
	
	
}
