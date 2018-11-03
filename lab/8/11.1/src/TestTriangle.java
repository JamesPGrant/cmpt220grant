import java.util.Scanner;

public class TestTriangle {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the color of the triangle: ");
		String color = input.next();
		System.out.print("Enter sides of triangle:");
		double [] sides = new double[3];
		for(int i = 0; i< sides.length; i++) sides[i] = input.nextDouble();
		System.out.print("Is the triangle filled?: true or false?");
	    String isFilledString = input.next();
	    boolean isFilled = (isFilledString.equals("true")); 
	    //System.out.print("Area of triangle is: "+ triangle.getArea());
	     
	     Triangle triangle = null;
	try {
		triangle = new Triangle(sides[0], sides[1], sides[2]);
		triangle.setColor(color);
		triangle.setFilled(isFilled);
		System.out.print("Area of triangle is: "+ triangle.getArea());
		System.out.print("\n");
		System.out.print("Perimeter:" + triangle.getPerimeter());
		System.out.print("\n");
		System.out.print("Color?:" + triangle.getColor());
		System.out.print("\n");
		System.out.print("filled?: "+ triangle.isFilled());
		System.out.print("\n");
	}
	catch(NullPointerException e){
	}

	}
}