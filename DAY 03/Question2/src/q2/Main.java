package q2;

public class Main {

	public static void main(String[] args) {

		ReverseStack rs = new ReverseStack(5);
		rs.push(1);
		rs.push(2);
		rs.push(4);
		rs.push(6);
		rs.push(8);
		rs.reverseTheStack();
	}

}
