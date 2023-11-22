package q3;

public class Main {

	public static void main(String[] args) {

		SinglyLinearLinkedList s = new SinglyLinearLinkedList();
			s.addFirst(1);
			s.addFirst(3);
			s.addFirst(5);		
			s.addFirst(7);
////Working		s.deleteFirst();
//		
//		s.addLast(9);
//
//		s.deleteLast();
//		
//		s.insertAfterGivenNode(0, 3);
//		s.Display();

		s.addAtPosition(0, 0);
		s.insertAfterGivenNode(9, 2);
		s.insertBeforeGivenNode(1, 4);
		s.Display();
		

	}

}
