package exercises;
import java.util.Scanner;
public class NumbersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x ;
		int y ;
		
		displayTwiceTheNumber(x,y);
		displayNumberPlusFive();
		displayNumberSquared();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter number >> ");
		 x= input.nextInt();
		System.out.println("Please enter another number >> ");
		 y= input.nextInt();
		
		
	}
	public static void displayTwiceTheNumber(int x, int y) {
			int x2;
			int y2;
			
			x2 = x * 5;
			y2 = y * 5;
			System.out.println("x = " + x2 + "y =" + y2);
}
	public static void displayNumberPlusFive() {
		

		int x2;
		int y2;
		
		x2 = x + 5;
		y2 = y + 5;
		System.out.println("x = " + x2 + " y = " + y2);
	}
	public static void displayNumberSquared() {
		int x;
		int y; 
		
		int x2;
		int y2;
		
		x2 = x * x;
		y2 = y * y;
		
		System.out.println(" x = " + x2 + " y = " + y2);
	}
}