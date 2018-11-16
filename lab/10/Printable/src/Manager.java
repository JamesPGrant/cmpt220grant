
public class Manager implements Printable{
	private String name;
	private int age;
	
	Manager(String name, int age){
		this.name = name;
		this.age = age;
	}

	@Override
	public void print() {
		System.out.print(age + name);
		
	}

}
