import java.util.Scanner;
public class ImparPar {

	public static void main(String[] args) {
		Scanner inteiro = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		
		int numero = inteiro.nextInt();
		if (numero % 2 == 0){
			System.out.println("Esse n�mero � par !");
		} else {
			System.out.println("Esse n�mero � impar ! ");
		}
	}

}
