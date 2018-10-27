
public class Circle {
	private double x;
	private double y;
	private double x2;
	private double y2;
	private double radius;
	public Circle() {
		raidus = 0
		x = 0;
		y = 0;
		x2 = 0;
		y2 = 0;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getX2() {
		return x2;
	}
	public void setX2(double x2) {
		this.x2 = x2;
	}
	public double getY2() {
		return y2;
	}
	public void setY2(double y2) {
		this.y2 = y2;
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double c2(double radius) {
		return radius;
	}
	Circle(double circleX, double circleY, double circleRadius){
		x = circleX;
		y = circleY;
		radius = circleRadius;
	} 
	public double getArea() {
		return Math.PI * radius * radius;
	}
	public double getPerimeter() {
		return 2 * Math.PI *radius;
	}
	public boolean contains(double x, double y) {
		double distance = Math.sqrt(Math.pow(x - x2, 2) + Math.pow(y - y2, 2));
		if(distance <= ((radius) + (c2.radius)));
		return true; 
}
	public boolean contains(Circle circle) {
		double distance = Math.sqrt(Math.pow(x - x2, 2) + Math.pow(y - y2, 2));
		if(distance >(radius)+(c2.radius));
		return true;
	}
	public boolean overlaps(Circle circle) {
		double distance = Math.sqrt(Math.pow(x - x2, 2) + Math.pow(y - y2, 2));
		if(Math.abs((radius - c2.radius)) <= distance && distance <=(radius+ c2.radius));
		return true;
	}
}
