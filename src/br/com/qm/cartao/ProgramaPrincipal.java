package br.com.qm.cartao;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		CartaoCredito cartao = new CartaoCredito(5000, "Paco Flávius");

		cartao.aumentaLimite(-500F);

		cartao.imprimirFatura();

		cartao.realizarCompra(3000F);

		cartao.imprimirFatura();

		cartao.realizarCompra(3001F);

		cartao.imprimirFatura();

	}

}
