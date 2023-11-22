package q2;

public class Main {

	public static void main(String[] args) {
		
		SinglyCircular sc = new SinglyCircular();

		sc.AddFirst(3);
		sc.AddFirst(7);
		sc.AddFirst(5);
		sc.AddFirst(6);
		sc.AddFirst(1);
		sc.AddFirst(8);
		sc.AddFirst(2);
		sc.AddLast(0);
		sc.DelFirst();
		sc.DelLast();
		sc.AddFirst(3);


		sc.Display();
		
		sc.AddFirst(3);
	}

}
