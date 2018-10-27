
public class TestCircle {
public static void main(String []args) {
	Circle c1 = new Circle(2, 2, 5.5);
	System.out.println("The area of the circle is: " + c1.getArea()
	+ "\n"+ "The perimeter of the circle is: " + c1.getPerimeter() 
	+"\n" + "The point is in the circle: " + c1.contains(3,3)
	+"\n" + "The cirlce is inside of the circle:" + c1.contains(new Circle(4,5,10.5))
	+ "\n" + "The circle overlaps the circle: " + c1.overlaps(new Circle(3, 5, 2.3)));
}
	public static boolean contains(double x, double y) {
		return contains(3,3);
		
	}
	public static boolean contains(Circle circle) {
		return contains(new Circle(4, 5, 10.5));
	}
	public static boolean overlaps(Circle circle) {
		return overlaps(new Circle(3, 5, 2.3));
	}
	}