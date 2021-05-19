package br.com.qm.formas;

public class Circulo extends FormaGeometrica {

	private double raio;


	public Circulo(double raio) {
		super();
		this.raio = raio;
	}



	@Override
	public void calculaArea() {
		System.out.println("~~Calculando a �rea do C�rculo~~");
		super.setArea(Math.PI * Math.pow(raio, 2));


	}

}
