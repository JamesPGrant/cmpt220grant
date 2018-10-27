
public class TestMyLong {
	public static boolean isPrime(MyLong value) {
		return MyLong.isPrime(value.getValue());
	}
	public static boolean isEven(MyLong value) {
		return MyLong.isEven(value.getValue());
	}
	public static boolean isOdd(MyLong value) {
		return MyLong.isOdd(value.getValue());
	}
	public static void main(String [] args) {
		
		MyLong value = new MyLong();
		
		System.out.println("The value is: "+ value.getValue());
		System.out.println("Is it even?:" + value.isEven() + "\n"
				+ "Is it odd?" + value.isOdd()+ "\n" + "Is it prime?" 
				+ value.isPrime());
		System.out.println("Is it MyLong prime?:" + MyLong.isPrime(value.getValue()));
		System.out.println("Is it MyLong odd?:" + MyLong.isOdd(value.getValue()));
		System.out.println("Is it MyLong even?:" + MyLong.isEven(value.getValue()));
	}
}

