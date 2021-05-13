package br.com.qm.televisao;

public class Televisao {

	private int canalAtual;
	private int volumeAtual;

	public Televisao(int i, int j) {
		// TODO Auto-generated constructor stub
	}

	public void Televisao(int canalAtual, int volumeAtual ) {

		this.canalAtual = canalAtual;
		this.volumeAtual = volumeAtual;
	}

	public int getCanalAtual() {
		return canalAtual;
	}

	public void setCanalAtual(int canalAtual) {
		this.canalAtual = canalAtual;
	}

	public int getVolumeAtual() {
		return volumeAtual;
	}

	public void setVolumeAtual(int volumeAtual) {
		this.volumeAtual = volumeAtual;
	}




}
