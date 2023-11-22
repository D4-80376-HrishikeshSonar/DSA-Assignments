package q5;

public class Question5 {
	
	
	public static int operationPriority(char operator) {
		switch (operator) {
		case '+':
			return -10;
		case '-':
			return -10;
		case '*':
			return 0;
		case '/':
			return 0;
		case '%':
			return 0;

		case '$':
			return 1;

		
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(operationPriority('+'));

		
	}

}
