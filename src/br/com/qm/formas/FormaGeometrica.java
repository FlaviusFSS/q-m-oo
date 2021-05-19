package br.com.qm.formas;

public abstract class FormaGeometrica {

	private double area;

	public FormaGeometrica() {

	}


	public abstract void calculaArea();


	public double getArea() {
		return area;
	}


	protected void setArea(double area) {
		this.area = area;
	}



}
