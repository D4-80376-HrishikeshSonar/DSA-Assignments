package q1;
class LinkedList{
	static class Node{
		int data;
		Node next;
		Node(int val){
			this.data = val;
			next = null;
		}
	}
	
	private Node head;
	public LinkedList() {
		head = null;
	}
	
	public void addFirst(int value) {
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
		}
		else {
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void DisplayList() {
		Node trav = head;
		if(head == null) {
			return;
		}
		while(trav != null) {
			System.out.println(trav.data);
			trav = trav.next;
		}
	}
	
	public void addLast(int value) {
		Node newNode = new Node(value);
		if(head == null)
			head = newNode;
		else {
			Node trav = head;
			while(trav.next != null) {
				trav = trav.next;
			}
			trav.next = newNode;
			
		}	
	}
	
	public void deleteFirst() {
		if(head == null) {
			return;
		}
		else {
			head = head.next;
		}
	}
	
	public void deleteLast()
	{
		if(head == null) {
			return;
		}
		else
		{
			Node trav = head;
			while(trav.next.next != null) {
				trav = trav.next;
			}
			trav.next = null;
		}
	}
	
	
}



public class List {
	public static void main(String[] args) {
		
	
	LinkedList l1 = new LinkedList();
	
	l1.addFirst(2);
	l1.addFirst(3);
	l1.addLast(4);
	l1.addLast(9);
	l1.addLast(5);
	l1.DisplayList();
	
	System.out.println();
	l1.deleteLast();
	l1.DisplayList();
	
	}
}
