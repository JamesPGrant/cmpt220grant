
public class Squareee {
private double width;
private double length;

Squareee(){
	
}
public Squareee(Double width, Double length) {
	this.width = width;
	this.length = length;
}
public double getArea1() {
	width = 40;
	length = 2;
	double area1 =(width * length);
	return area1;
}
public double getPerimeter1() {
	int x1 = 4;
	double perimeter1 = (x1 * getArea1());
	return perimeter1;
	
}
public double getArea2() {
	width = 35.9;
	double area2 = (width * length);
	return area2;
}
public double getPerimeter2() {
	int x2 = 4;
	double perimeter2 = (x2 * getArea2());
	return perimeter2;
}
}

