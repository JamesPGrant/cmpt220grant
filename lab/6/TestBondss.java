
public class TestBondss{
	public static void main(String[] args) {
		Bondss price1 = new Bondss(500, 100, .05, 10000);
		
		price1.getPrice();
		
		System.out.println("Your bond is worth: " + "\n" + 
				price1.getPrice() + " " );
		
	}
	

}
