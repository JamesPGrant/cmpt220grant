
public abstract class AbstractClass {

	public abstract void printMessage();
	
	public static void main(String[] Args) {
	SubClass subclass = new SubClass();
	subclass.printMessage();
	SubClass2 subclass2 = new SubClass2();
	subclass2.printMessage();
	}
}
