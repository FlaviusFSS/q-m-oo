package br.com.qm.conta;

public class ContaBancaria {

	private int nroConta;
	private float saldo;
	private String nomeCorrentista;


	public ContaBancaria(int nroConta, String nomeCorrentista) {
		this.nroConta = nroConta;
		this.nomeCorrentista = nomeCorrentista;
		this.saldo = 0;
	}


	public boolean saque(float valor) {

		if (this.saldo >= valor && valor > 0) {
			this.saldo -= valor;
			return true;
		}
		return false;

	}


	public boolean deposito(float valor) {

		if (valor > 0) {
			this.saldo += valor;
			return true;
		}
		return false;

	}


	public void extrato() {
		System.out.println("\n~~~~~~~~EXTRATO~~~~~~~~\n");
		System.out.println("\nNro da conta: %d, this.nroConta");
		System.out.println("\nCorrentista: %s, this.nomeCorrentista");
		System.out.println("\nSaldo: %.2f, this.saldo");
	}




}
