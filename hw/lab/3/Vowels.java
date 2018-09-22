import java.util.Scanner;

public class Vowels{
	public static main void(String[]args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Write your sentence:");
		int vowels = 0;
		String line = input.nextLine();
		line = line.toLowerCase();
		for(int i = 0; i < line.length(); ++i)
		{
			char ch = line.chareAt(i);
			if(ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u'){
				++vowels;
			}
		}
		System.out.println("Vowels: " + vowels);
	}
}

		