import java.util.Scanner;

public class TestStackOfIntegers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		
		StackOfIntegers stack = new StackOfIntegers();
		
		for (int i = 0; i < 10; i++)
			stack.push(i);
		
		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
		System.out.println("Reverse: "+ stack.reverse());

	}

}
