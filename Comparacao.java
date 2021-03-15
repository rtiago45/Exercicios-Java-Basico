import java.util.Scanner;


public class Comparacao {
	public static void main(String[] args) {
		
		int integer1;
		int integer2;
		Scanner in = new Scanner (System.in);
		
		System.out.println("Type a number: ");
		integer1 = in.nextInt();
		
		System.out.println("Type another number: ");
		integer2 = in.nextInt();
		
		if (integer1 != integer2) {
			System.out.printf("%d != %d\n", integer1, integer2);
		}
		
		if (integer1 < integer2) {
			System.out.printf("%d < %d\n", integer1, integer2 );
		}
		
		if (integer1 <= integer2) {
			System.out.printf("%d <= %d\n", integer1, integer2);
		}
		
		if (integer1 > integer2) {
			System.out.printf("%d > %d\n", integer1, integer2);
		}
		
		if (integer1 > integer2) {
			System.out.printf("%d > %d\n", integer1, integer2);
		}
		
		if (integer1 >= integer2) {
			System.out.printf("%d >= %d\n", integer1, integer2);
		}		
		
	}
}
