package br.com.qm.pessoa;

public class Pessoa {

	private String nome;
	private int anoNascimento;
	private float altura;


	public Pessoa(String nome, int anoNascimento, float altura) {
		super();
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.altura = altura;
	}

	public int calculaIdade(int anoAtual) {
		int idade = anoAtual - this.anoNascimento;
		return idade;
	}

	public void imprimeDados() {
		System.out.println("--------");
		System.out.printf("\nNome: %s\n", this.nome);
		System.out.printf("\nAno de Nascimento: %d\n", this.anoNascimento);
		System.out.printf("\nAltura: %.2f\n", this.altura);
		System.out.printf("\nIdade: %d\n", this.calculaIdade(2021));
		System.out.println("--------");
	}


	public float getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		this.altura = altura;
	}


	public String getNome() {
		return nome;
	}


	public int getAnoNascimento() {
		return anoNascimento;
	}



}
