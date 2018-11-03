import java.util.Scanner;

public class BrickBuilderr {
		
		public static void main(String[] args) {
			Scanner input = new Scanner (System.in);
			
			System.out.println("Enter height: ");
			int height = input.nextInt();
			System.out.println("Enter width: ");
			int width = input.nextInt();
			System.out.print("Enter numbricks: ");
			int numbricks = input.nextInt();
			System.out.print("Enter lenbrick: ");
			int lenbrick = input.nextInt();
		
			int index = 0;
			int layer = 0;
			int brick;
			boolean completion = true;
		
			for(int i = 0; i< numbricks; i++) {
				brick = input.nextInt();
				index += brick;
				if (index > lenbrick) {
					completion = false;
					break;
				}
				if (index > width) {
				completion = false;
				break;
			}else if(index == width) {
				if(layer == height) {
					break;
				}
			}else {
				completion = true;
				break;
				
			}
		}
		System.out.println(completion ? "Yes" : "No");
		System.out.close();
		}

	}
