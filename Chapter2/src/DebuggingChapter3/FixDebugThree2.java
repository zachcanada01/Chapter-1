package DebuggingChapter3;

public class FixDebugThree2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a = 2, b = 5, c = 10;
	      add(b, c);
	      add(b, c);
	      subtract(c, a);
	}
	public static void add(int a, int  b)
	   {
	      System.out.println("The sum of " + a +
	         " and " + b + " is " + (a + b));
	   }
	   public static void subtract(int a, int b)
	   {
	    int a2 = 2;
	    int b2 = 5;
	
		System.out.println("The difference between " +
	        a2 + " and " + b2 + " is " +  (a2 - b2));
	   }
}
