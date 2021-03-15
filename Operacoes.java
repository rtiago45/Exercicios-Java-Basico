import java.util.Scanner;

public class Operacoes {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Type a number: ");
		int num1 = in.nextInt();
		
		System.out.println("Type another number: ");
		int num2 = in.nextInt();
		
		System.out.println("The numbers that your choose is  " + num1 + " and " + num2);
		System.out.println("");
		System.out.println("The sum between de number's is: " + (num1 + num2));
		System.out.println("The mutiply between de number's is: " + (num1 * num2));
		System.out.println("The subtract between de number's is: " + (num1 - num2));
		System.out.println("The division between de number's is: " + (num1 / num2));
		System.out.println("The mod between de number's is: " + (num1 % num2));

	}
}
