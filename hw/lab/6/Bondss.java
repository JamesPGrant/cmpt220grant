
public class Bondss {
	private double coupon;
	private int payments;
	private double interest;
	private double valueMaturity;
	
Bondss() {

}
Bondss(double coupon, int payments, double interest, double valueMaturity){
	this.coupon = coupon;
	this.payments = payments;
	this.interest = interest;
	this.valueMaturity = valueMaturity;
}
public double getPrice() {
	coupon = 500;
	payments = 100;
	interest = .05;
	valueMaturity = 10000;
	double price = (500 * 1 - (1 / Math.pow(1+ .05, 100))) + 10000 * 1/Math.pow(1+.05 , 100);
	return price;
}
}