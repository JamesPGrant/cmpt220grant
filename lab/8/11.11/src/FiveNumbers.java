import java.util.ArrayList;
import java.util.Scanner;
//for(dint i = 0; i< sides.length; i++) sides[i] = input.nextDouble();
public class FiveNumbers{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter five numbers: ");
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 5;i++) list.add(input.nextInt());
		
	System.out.println(list);
	sort(list);
}
	public static void sort(ArrayList<Integer> list) {
		 for (int i = 0; i < list.size() - 1; i++) {
	            int min = list.get(i);
	            int in = i;

	            for (int j = i + 1; j < list.size(); j++) {
	                if (min > list.get(j)) {
	                    min = list.get(j);
	                    in = j;
	                }
	            }

	            if (in != i) {
	                list.set(in, list.get(i));
	                list.set(i, min);
	            }	
	System.out.print("Higher:" + list.toString());
}
}
}