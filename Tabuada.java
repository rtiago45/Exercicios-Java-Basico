import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Type a number: ");
		int num1 = in.nextInt();
		
		for (int contador = 0; contador <10; contador++) {
			System.out.println(num1 + "x" + (contador+1) + "=" + (num1*(contador+1)));
		}

	}
}
