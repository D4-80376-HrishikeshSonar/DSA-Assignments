package q4;

public class Main {

	public static void main(String[] args) {

		CircularQueue cq = new CircularQueue(4);
		cq.enqueue(1);
		cq.enqueue(2);
		cq.enqueue(3);
		cq.enqueue(5);
		
		cq.dequeue();
		cq.dequeue();
		cq.enqueue(1);
		cq.enqueue(10);
		
		cq.printQueue();
	}

}
