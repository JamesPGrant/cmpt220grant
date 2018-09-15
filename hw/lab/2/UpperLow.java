import java.util.Scanner;

public class Upperlower{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the lower limit:");
		int a = input.nextInt();
		
		System.out.print("Enter the upper limit:");
		int b = input.nextInt();
		
		int random = Math.random() * (b - a) + 1;
		System.out.println("Your random number is: " + random);
	
	}
}
		
			
		