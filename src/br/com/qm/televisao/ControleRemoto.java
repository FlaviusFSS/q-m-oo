package br.com.qm.televisao;

public class ControleRemoto {

	private Televisao televisao;
	private int volumeMax;
	private int volumeMin;
	private int canalMax;
	private int canalMin;


	public ControleRemoto(int volumeMax, int volumeMin, int canalMax, int canalMin) {
		this.televisao = new Televisao(0, 0);
		this.volumeMax = volumeMax;
		this.volumeMin = volumeMin;
		this.canalMax = canalMax;
		this.canalMin = canalMin;
	}

	public void aumentaVolume() {

		int volumeAtual = this.televisao.getVolumeAtual();
		if (televisao.getVolumeAtual() < volumeMax) {
			televisao.setVolumeAtual(televisao.getVolumeAtual() + 1);
		}

	}

	public void diminuiVolume() {

		int volumeAtual = this.televisao.getVolumeAtual();
		if (televisao.getVolumeAtual() > volumeMax) {
			televisao.setVolumeAtual(televisao.getVolumeAtual() - 1);
		}

	}

	public void proximoCanal() {

		int canalAtual = this.televisao.getCanalAtual();
		if (canalAtual < this.canalMax) {
			televisao.setCanalAtual(televisao.getCanalAtual() + 1);
		}

	}

	public void voltaCanal() {

		int canalAtual = this.televisao.getCanalAtual();
		if (canalAtual < this.canalMin) {
			televisao.setCanalAtual(televisao.getCanalAtual() - 1);
		}

	}

	public void trocaCanal(int novoCanal) {

		if (novoCanal >= this.canalMin && novoCanal <= this.canalMax) {
			televisao.setCanalAtual(novoCanal);
		}

	}
	//às 19:22
	public void consultarTv() {
		System.out.println("-------------");
		System.out.printf("\nCanal Atual: %d", this.televisao.getCanalAtual());
		System.out.printf("\nVolume Atual: %d", this.televisao.getVolumeAtual());
		System.out.println("-------------");
	}


}
