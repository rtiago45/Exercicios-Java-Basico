import java.util.Scanner;
public class ImparPar {

	public static void main(String[] args) {
		Scanner inteiro = new Scanner(System.in);
		System.out.println("Digite um número: ");
		
		int numero = inteiro.nextInt();
		if (numero % 2 == 0){
			System.out.println("Esse número é par !");
		} else {
			System.out.println("Esse número é impar ! ");
		}
	}

}
