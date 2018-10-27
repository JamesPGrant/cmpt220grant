
public class MyLong {
	private long value;
	
	public void MyLong(long value) {
		this.value = value;
	}

	public long getValue() {
		return value;
	}
	public boolean isEven() {
		if((value % 2) == 0)
		return true;
		return false;
	}
	public boolean isOdd() {
		if((value % 2) != 0)
		return true;
		return false;
	}
	public boolean isPrime() {
		for(long i = 2; i < value; i++)
			if((value % i ) == 0)
				return true;
				return false;
	}
	public static boolean isEven(long value) {
		if((value % 2) == 0)
		return true;
		return false;
		
	}
	public static boolean isOdd(long value) {
		if((value % 2) != 0)
		return true;
		return false;
		
	}
	public static boolean isPrime(long value ) {
		for(long i = 2; i < value; i++)
			if((value % i) == 0)
				return true;
				return false;
		
	}
	public boolean isEven(MyLong value) {
		if((this.value % 2 ) == 0)
		return true;
		return false;
	}
	public boolean isOdd(MyLong value) {
		if((this.value % 2) != 0)
			return true;
			return false;
	}
	public boolean isPrime(MyLong value) {
		for(long i = 2; i < this.value; i++)
			if((this.value % i) == 0)
				return true;
				return false;
	}
	public boolean equals(long value) {
		if((value == getValue() ))
		return true;
		return false;
		
	}
	public boolean equals(MyLong value) {
		if(this.value == getValue())
		return true;
		return false;
	}
	public static char[] parseLong(char[] value) {
		char[] parse = new char[value.length];
			for(int i = 0; i < value.length;i++)
				parse[i] = value[i];
			
			return parse;
		
		
	}
	public static long parseLong(String value) {
		long number = Long.parseLong(value);
		return number;
		
	}
}
