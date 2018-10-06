import java.util.Scanner;

public class DosArrays{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = input.nextInt();
		int [] x = new int [size];
		int[] y  = new int [size];
		for (int i = 0; i < size; i ++) {
			System.out.print("Enter the size of the "+i+"th elemenths of the first array");
			x[i] = input.nextInt();
			System.out.print("Enter the size of the "+i+"th elemenths of the second array");
			y[i] = input.nextInt();
		}
		System.out.println(equal(x, y));
}
public static boolean equal (int [] x, int[] y) {
	if(x == y) {
		return true;
		
	}
	if (null == x || null == y) {
		return false;
	}
	if(x.length != y.length) {
		return false;
	}
	for(int i = 0; i < x.length ; i++);
		int i = 0;
		if(x[i] != y[i]) {
			return false;
		}
	return true;
} 
}
