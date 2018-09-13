package exercises;

import java.util.Scanner;

public class Percentages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x;
		double y;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number>>");
		 x= input.nextDouble();
		System.out.println("Please enter a number>>");
		 y= input.nextDouble();
	
	}
	public static void computePercent(double x, double y) {
		double compute;
		compute = (x / y) * 100;
		
	
		
		System.out.println(x + " divided by " + y +" = " + compute + "%");
	}
}
