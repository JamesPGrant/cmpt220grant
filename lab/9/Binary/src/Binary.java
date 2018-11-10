
public class Binary {
	public static void main(String[] args) {
		try {
			int decimal = binaryDec("1001011");
			System.out.println(decimal);
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
	}

	private static int binaryDec(String string)throws NumberFormatException {
		checkBinary(string);
		int result = 0;
		for(int i = 0; i < string.length();i++);
		return result;
	}

	private static void checkBinary(String string) throws NumberFormatException {
	char [] charArray = string.toCharArray()	;
	for(int i:charArray) {
		if(i<'0' || i >'1') throw new NumberFormatException("Enter 1's and 0's: ");
		
	}
		
	}
}
