package q2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ReverseStack {
	private int SIZE;
	private int arr[];
	private int reverseArr[];
	private int top;
	
	public ReverseStack(int Size) {
		SIZE = Size;
		arr = new int[SIZE];
		reverseArr = new int[SIZE];
		top  = -1;
		}
	
	
	public void push(int value) {
		top++;
		arr[top] = value;
	}
	
	public void pop() {
		top--;
	}
	public int peek() {
		return arr[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	public boolean isFull() {
		return top == SIZE -1;
	}
	
	public void reverseTheStack() {
		for(int i = 0;i<SIZE; i++) {
			reverseArr[i] = arr[top];
			top--;
		}
		for(int i = 0 ; i< reverseArr.length;i++) {
		System.out.println("Reversed Stack: " +reverseArr[i] );
	}
	}
}
