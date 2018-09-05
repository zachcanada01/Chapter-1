package exercises;
import java.util.Scanner;

public class QuartsToGallonsInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int QTS_IN_GALLONS = 4;
		int numberOfquarts = 18;
		int gallons;
		int quartsremaining ;
		
		gallons = (numberOfquarts / QTS_IN_GALLONS);
		quartsremaining = (numberOfquarts % QTS_IN_GALLONS);
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("You will need " + gallons + quartsremaining + "quarts");
		numberOfquarts = input.nextInt();
		
	
	
		
		
	}

}
