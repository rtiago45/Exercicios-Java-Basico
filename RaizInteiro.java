import java.util.Scanner;
import java.io.IOException;

public class RaizInteiro {
	public static void main(String[] args) {
		Scanner real = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		
		int inteiro = real.nextInt();
	    if (inteiro >=0) {
	    	System.out.println("O numero " + inteiro + " elevado por 2 � " + Math.pow(inteiro, 2));
	    	System.out.printf("A raiz do numero " + inteiro + " � de " + Math.sqrt(inteiro));
	    }     	
	     else {
	    	System.out.println("Digite um n�mero positivo!");
	    }

	}
}