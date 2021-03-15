import java.util.Scanner;

public class Elevado {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter one number:");

	    // Numerical input
	    int one = myObj.nextInt();
	    if (one >= 0) {
	    	System.out.println("The number is positive and elevate by 2 is " + one *Math.pow(one,1));
	    }     	
	     else {
	    	System.out.println("The number is negative.");
	    }
    }
}