package q2;

public class SinglyCircular {
	static class Node{
		int data;
		Node next;
		Node(int value){
			data = value;
			next = null;
		}
	}
	private Node tail;
	public SinglyCircular() {
		tail = null;
	}
	
	public void AddFirst(int value) {
		Node newNode = new Node(value);
		if(tail == null) {
			newNode.next = newNode;
			tail = newNode;
		}
		else {
			newNode.next = tail.next;
			tail.next = newNode;
		}
	}
	
	public void AddLast(int value) {
		Node newNode = new Node(value);
		if(tail == null) {
			tail = newNode;
		}
		else
		{
			newNode.next = tail.next;
			tail.next = newNode;
			tail = newNode;	
		}
	}
	
	public void DelFirst() {
		if(tail == null) {
			System.out.println("List is empty");
		}
		else {
			tail.next = tail.next.next;
		}
	}
	
	public void DelLast() {
		if(tail == null) {
			System.out.println("list is empty");
		}
		else {
			Node trav = tail.next;
			while(trav.next != tail) {
				trav = trav.next;
			}
			tail = trav;
		}
	}
	
	public void Display()
	{
		if(tail==null)
		System.out.println("List is empty...!!");
		else {
			Node trav = tail.next;
			while(trav != tail)
			{
				System.out.println(trav.data);
				trav = trav.next;
				
			}
			System.out.println(trav.data);

		}
	}
	
	
	
	
	
	
	
	
	
}
