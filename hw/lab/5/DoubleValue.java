import java.util.Scanner;

// JA: Where did you call the method?
public class DoubleValue {
	public static void main(String[]args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = input.nextInt();
		int [] x = new int [size];
		for (int i = 0; i < size; i ++) {
			System.out.print("Enter the size of the "+i+"th elemenths of the first array");
			x[i] = input.nextInt();
		}
			System.out.print(size);
	}
	public static double max(double[] array){
	double max = Double.NEGATIVE_INFINITY;
	
	for(double cur: array)
		max = Math.max(max, cur);
	System.out.println("The value is:" + max);
	return max;

	
		}
			
		
	
	}
		
	
