package br.com.qm.elevador;

public class Elevador {

	private int andarAtual;
	private int totalAndares;
	private int capacidade;
	private int qtdPessoas;


	public Elevador(int totalAndares, int capacidade) {
		this.andarAtual = 0;
		this.totalAndares = totalAndares;
		this.capacidade = capacidade;
		this.capacidade = 0;
	}


	public void entra() {

		if (qtdPessoas < capacidade) {
			qtdPessoas++;
			return;	
		}

		throw new CargaElevadorException("O Elevador já cheio!");
	}


	public void sai() throws CargaElevadorException {

		if (qtdPessoas < capacidade) {
			qtdPessoas--;
		}

		throw new CargaElevadorException("O Elevador já vazio!");
	}


	public void sobe() {

		if (andarAtual < totalAndares) {
			andarAtual++;
		}

	}


	public void desce() {

		if (andarAtual > 0) {
			andarAtual--;
		}

	}

	public void status() {
		System.out.println("~~~~~~~~~~~~~~");
		System.out.printf("\nO elevador está no andar: %d\n", this.andarAtual);
		System.out.printf("\nHá %d pessoas no elevador.\n", this.qtdPessoas);
		System.out.println("~~~~~~~~~~~~~~");

	}


	public int getTotalAndares() {
		return totalAndares;
	}


	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}


	public int getCapacidade() {
		return capacidade;
	}


	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}


	public int getAndarAtual() {
		return andarAtual;
	}


	public int getQtdPessoas() {
		return qtdPessoas;
	}





}
