import java.util.Scanner;

public class calculadoraSimples {	
	
	public static void main(String[] args) {
		
		Scanner id = new Scanner(System.in);
		System.out.println("Type a number: ");		
		int num_1 = id.nextInt();

		System.out.println("Type another number: ");
		int num_2 = id.nextInt();

				
		Scanner id2 = new Scanner(System.in);
		System.out.println("Type a module, ex: +,-,*,/ ");
		String operator = id2.nextLine();

		
		int result = 0;
		switch (operator) {		

		case "+" :
				result = num_1 + num_2;
				System.out.println(result);
				break;
		
		case "-" :
				result = num_1 - num_2;
				System.out.println(result);
				break;
	
		case "*":
				result = num_1 * num_2;
				System.out.println(result);
				break;
		
		case "/":

				result = num_1 / num_2;
				System.out.println(result);
				break;
		}
	}
}
