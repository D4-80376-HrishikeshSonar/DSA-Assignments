package q4;


public class SinglyLinearLinked {
	static class Node{
		int data;
		Node next;
		Node(int value){
			data = value;
			next =null;
		}	
	}
	
	Node head;
	public SinglyLinearLinked() {
		head = null;
	}
	
	public void Display() {
		Node trav = head;
		while(trav != null) {
			System.out.print(trav.data);
			trav = trav.next;
		}
		
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
	
	public void addLast(int value) {
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
		}
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
	
	public void deleteLast() {
		if(head == null) {
			return;
		}
		else {
			Node trav =head;
			while(trav.next.next != null) {
				trav = trav.next;
			}
			trav.next = null;
		}
	}
	
	public void addAtPosition(int value, int position) {
		Node newNode = new Node(value);
		
		if(head == null) {
			head = newNode;
		}
		else if(position<1) {
			addFirst(value);
		}
		else {
			Node trav = head;
			for(int i = 0; i<position-1 && trav.next != null;i++) {
				trav = trav.next;	
			}
			newNode.next = trav.next; 
			trav.next = newNode;
		}
		
	}

	public void insertAfterGivenNode(int value,int position) {
		Node newNode = new Node(value);
		
		if(head==null) {
			head = newNode;
		}
		else if(position<1) {
			addFirst(value);
		}
		else {
			Node trav = head;
			for(int i=0; i<position; i++) {
				trav=trav.next;
			}
			newNode.next = trav.next;
			trav.next = newNode;
		}
	}
	public void insertBeforeGivenNode(int value,int position) {
		Node newNode = new Node(value);
		
		if(head==null) {
			head = newNode;
		}
		else if(position<1) {
			System.out.println("invalid position");
		}
		else if(position == 1) {
			addFirst(value);
		}
		else {
			Node trav = head;
			for(int i=0; i<position-2; i++) {
				trav=trav.next;
			}
			newNode.next = trav.next;
			trav.next = newNode;
		}
	}
	
	
	public void ReverseList() {
		Node t1 = head;
		Node t2 = head.next;
		while(t2 != null) {
			Node t3 = t2.next;
			t2.next = t1;
			t1 = t2;
			t2 = t3;
		}
		head.next = null;
		head = t1;
		
	}
	
}