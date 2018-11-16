
public class Rectangle implements Printable{
	private double height;
	private double width;
	
 Rectangle(double height, double width) {
	 this.height = height;
	 this.width = width;
	}

@Override
public void print() {
	System.out.print(height + width);
	
}
	

}
