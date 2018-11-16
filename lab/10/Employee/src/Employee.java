public abstract class Employee {
	String name;
	double age;
	double hourRate;

	public abstract double salary(double hours);
 
	public String toString() {
		return "name= " + name + " age=" + age + " hourRate="
				+ hourRate;
 }
	/*public static void main(String[] args) {
		Manager manager = new Manager();
		manager.name();
		manager.age();
		manager.hourRate();
		Clerk clerk = new Clerk();
		clerk.salary();
		clerk.name();
		clerk.age();
		clerk.hourRate();
	}*/
}