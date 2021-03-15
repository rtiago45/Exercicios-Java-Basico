import java.util.Scanner;

public class LabFaculdade {
	private String nome;
	private double saldo;
	private int conta;
	private double deposito;
	private double depositoValor;
	
	Scanner teclado = new Scanner(System.in);
	
	public void totalContas(int totalContas) {
		this.conta += totalContas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo += deposito;
	}

	public void setSaldo(int saldo) {
		if (this.saldo <= 0) {
			this.saldo = 0;
		} else {
		this.saldo = saldo;
		}
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public void setDeposito(double deposito) {
		if (deposito > 0 ) {
			System.out.println("Digite o valor do depósito: ");
			deposito = teclado.nextDouble();
			deposito = saldo + depositoValor;
		} else {
			System.out.println("Depósito não realizado!");
		}
	}

	public double getDeposito() {
		return deposito;
	}
	
	
}
