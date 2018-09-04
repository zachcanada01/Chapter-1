package exercises;
import java.util.Scanner;

public class QuartsToGallonsInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		int quart;
		int gallon = quart/4 ;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many quarts do you need? >> ");
		quart = input.nextInt();
		
		System.out.println("You need" + gallon + "quarts");
		
		
	}

}
