package exercises;
import java.util.Scanner;

public class NauticalMilesInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double kilometers = 1.852;
		double miles = 1.150779;
		double nauticalmiles = 1;
		
		miles = (miles * nauticalmiles);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many nautical miles?");
		nauticalmiles = input.nextInt();
		
		System.out.println("This will equal " + miles * nauticalmiles + " miles.");

	}

}
