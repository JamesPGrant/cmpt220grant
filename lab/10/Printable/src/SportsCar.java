
public class SportsCar implements Printable {
private double id;
private String brandName;

SportsCar(String brandName, double id){
this.id = id;
this.brandName = brandName;
}
	@Override
	public void print() {
		System.out.print(brandName + id);
		
	}
	

}
