package q4;

public class DescendingStack {
	
	private int arr[];
	private int top;
	private final int size;
	public DescendingStack(int size) {
		this.size = size;
		arr = new int[size];
		top = size;	
	}
	
	public void push(int value) {
		top--;
		arr[top] = value;
	}
	
	public void pop() {
		top++;
	}
	
	public int peek() {
		return arr[top];
	}
	
	public boolean isEmpty() {
		return top == size;
	}
	
	public boolean isFull() {
		return top == size -1;
	}

	

}