package br.com.qm.carro;

public class Carro {

	private String nome;
	private float peso;
	private String fabricante;
	private String cor;
	private float valor;


	public Carro(String nome, float peso, String fabricante, String cor, float valor) {
		this.nome = nome;
		this.peso = peso;
		this.fabricante = fabricante;
		this.cor = cor;
		this.valor = valor;
	}

	public void darDesconto(float porcentagem) {

		if (porcentagem > 0 && porcentagem <= 10) {
			this.valor = this.valor * (1 - (porcentagem / 100F));
		}

	}

	public void printar(String novaCor) {
		this.cor = novaCor;
	}


	public String getNome() {
		return nome;
	}


	public float getPeso() {
		return peso;
	}


	public String getFabricante() {
		return fabricante;
	}


	public String getCor() {
		return cor;
	}


	public float getValor() {
		return valor;
	}







}
