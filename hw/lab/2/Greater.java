import java.util.Scanner;

public class Greater{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter a number you would like to add:");
		int a = input.nextInt();
		
		System.out.print("Enter a number you would like to add:");
		int b = input.nextInt();
		
		System.out.print("a < b: " + Boolean(a < b));
		System.out.print("a > b: " + Boolean(a > b));
		System.out.print("a <= b: " + Boolean(a <= b));
		System.out.print("a >= b: " + Boolean(a >= b));
		System.out.print("a != b: " + Boolean(a != b));
		System.out.print("a == b: " + Boolean(a == b));
		