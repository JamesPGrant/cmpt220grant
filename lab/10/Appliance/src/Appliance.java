
public class Appliance implements Comparable {
	private double voltage;
	private String Color;
	private String madeIn;
	private double price;
	
public double getVoltage() {
		return voltage;
	}
	public String getColor() {
		return Color;
	}
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getMadeIn() {
		return madeIn;
	}

	public int compareTo(Appliance TV, Telephone Toaster) {
		return 0;
		
	}
	public String toString() {
		return toString();
	}
public Appliance(double voltage, String Color, String madeIn, double price) {
	this.voltage = voltage;
	this.Color = Color;
	this.madeIn = madeIn;
	this.price = price;
}
@Override
public int compareTo() {
	// TODO Auto-generated method stub
	return 0;
}
	

}
