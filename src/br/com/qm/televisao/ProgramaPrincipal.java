package br.com.qm.televisao;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		ControleRemoto controle = new ControleRemoto(100, 0, 50, 0);

		controle.consultarTv();

		controle.aumentaVolume();
		controle.aumentaVolume();

		controle.proximoCanal();
		controle.proximoCanal();
		controle.proximoCanal();

		controle.diminuiVolume();
		controle.voltaCanal();

		controle.consultarTv();

		controle.trocaCanal(24);
		controle.trocaCanal(57);

		controle.consultarTv();

		for (int i = 0; i <100; i++) {
			controle.aumentaVolume();
		}

		controle.consultarTv();

	}

}
