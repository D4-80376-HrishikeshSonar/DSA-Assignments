//package List;

//import sun.invoke.empty.Empty;

class LinkedList {
	static class Node{
		int val;
		Node next;
		Node(int val){
			this.val = val;
			this.next = null;
		}
	}
	private Node head;
//	Node newNode = new Node();
	public LinkedList() {
		head = null;
	}
	public void addFirst(int val){
		Node newNode = new Node(val);
		if(head==null) {
			head= newNode;
		}
		else {
			newNode.next = head;
			head = newNode;
		}
	}
	public void displayList() {
		Node temp = head;
		if(head==null) {
			System.out.println("List is Empty..");
			return;
		}
		while(temp!=null) {
			System.out.println(temp.val);
			temp = temp.next;
		}
	}
}

public class List{
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.addFirst(1);
		l1.addFirst(2);
		l1.addFirst(3);
		
		l1.displayList();
	}
}


















