package q1;

import java.util.Stack;

public class Question1 {
	private Stack<Integer> st = new Stack<Integer>();
	private Stack<Integer> maxSt = new Stack<Integer>();
	
	public void push(int data)
	{
		int max = data;
		
		if(!maxSt.isEmpty() && max<maxSt.peek()) {
			max = maxSt.peek();
		}
		st.push(data);
		maxSt.push(max);
	}
	
	public void pop()
	{
		st.pop();
		maxSt.pop();
	}
	
	public int getMax()
	{
		return maxSt.peek();
	}
	

	public static void main(String[] args) {
		Question1 q1 = new Question1();
		q1.push(0);
		q1.push(9);
		q1.push(11);
		q1.push(5);
		q1.push(2);
		
		System.out.println(q1.st);
//		System.out.println(q1.maxSt);
		System.out.println("Max Element : "+ q1.getMax());
		
		
		
	}

}
