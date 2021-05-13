package br.com.qm.cartao;

public class CartaoCredito {

	float limite;
	float saldo;
	String nomeCliente;

	public CartaoCredito(float limite, String nomeCliente) {

		this.limite = limite;
		this.saldo = 0;
		this.nomeCliente = nomeCliente;

	}

	public void aumentaLimite(float valorAcrescido) {

		if (valorAcrescido > 0) {
			this.limite += valorAcrescido;
		}

	}

	public void diminuiLimite(float valorDecrescido) {

		if (valorDecrescido > 0 && valorDecrescido <= this.limite) {
			this.limite -= valorDecrescido;
		}

	}

	public void realizarCompra(float valorCompra) {

		float novoSaldo = saldo + valorCompra;

		if(novoSaldo <= limite) {
			this.saldo = novoSaldo;
		}

	}

	public void imprimirFatura() {
		System.out.println("---------");
		System.out.printf("\nO Seu limite �: %.2f\n", this.limite);
		System.out.printf("\nO Seu saldo �: %.2f\n", this.saldo);
		System.out.printf("\nSeus cr�ditos restantes s�o: %.2f\n", this.limite - this.saldo);
		System.out.println("---------");
	}

}








