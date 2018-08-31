package exercises;

import java.util.Scanner;

public class PracticeInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Num1 ;
		int Num2;
		int Total;
		String name;
		
		Scanner input = new Scanner(System.in);
	
		
		System.out.println("What is your name >> ");
		name = input.next();
		System.out.println(" Please enter a number >> ");
		Num1 = input.nextInt();
		System.out.println(" Please enter another number >> ");
		Num2 = input.nextInt();
		
		Total = Num1 + Num2;
	
		 
		System.out.println("Your name is " + name) ;
		System.out.println("The total is " + Total );
	
		

		 
		
	
	}

}
