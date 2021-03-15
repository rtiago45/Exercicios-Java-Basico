import java.util.Scanner;
import java.io.IOException;

public class RaizElevado {
	public static void main(String[] args) {
		Scanner real = new Scanner(System.in);
		System.out.println("Type a inter number: ");
		
		int inteiro = real.nextInt();
	    if (inteiro >=0) {
	    	System.out.println("A raiz do numero " + inteiro + " é de " + Math.sqrt(inteiro));
	    }     	
	     else {
	    	System.out.println("O numero " + inteiro + " elevado por 2 é " + inteiro *Math.pow(inteiro, 2));
	    }

	}
}
