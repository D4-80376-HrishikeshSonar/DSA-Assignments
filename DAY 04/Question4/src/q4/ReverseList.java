package q4;

public class ReverseList {
	public static void main(String[] args) {
		SinglyLinearLinked sll = new SinglyLinearLinked();
		sll.addFirst(2);
		sll.addFirst(4);
		sll.addFirst(1);
		sll.addFirst(3);
		sll.addFirst(5);
		sll.addFirst(7);
		sll.addFirst(6);
		sll.addFirst(8);
		sll.ReverseList();
		sll.Display();
	}
}
