package DebuggingChapter3;

public class FixDebugThree4 
{
	   public static void main(String args[])
	   {
	      int myCredits = 13;
	      int yourCredits = 17;
	      double rate = 75.84;
	      System.out.println("My tuition:");
	      tuitionBill(myCredits, rate);
	      System.out.println("Your tuition:");
	      tuitionBill(yourCredits, myCredits);
	   }
	   public static void tuitionBill(int c, double r)
	   {
	      System.out.println("Total due " + (r*c));
	   }
	}