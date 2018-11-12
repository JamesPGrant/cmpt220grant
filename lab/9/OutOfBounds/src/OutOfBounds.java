import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Random;

public class OutOfBounds {
	public static void main(String[]args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random rand = new Random();
		while (list.size()<100) {
			list.add(rand.nextInt(100) + 1);
		}
		int[] ints = new int[list.size()];
		final Iterator<Integer> iter = list.iterator();
		for(int i = 0; iter.hasNext(); ++i) {
			ints[i] = iter.next();
		}
		System.out.println(Arrays.toString(ints));
		System.out.print(main1(args));
	}
	// JA: Where is the exception?
	public static int main1(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the index of the integer: ");
		int s = input.nextInt();
		System.out.print(args[s]);
		return s;
	}
}


