package br.com.qm.carro;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		Carro uno = new Carro("Uno", 1000, "Fiat", "Azul", 80000);
		Carro doblo = new Carro("Doblô", 1400, "Fiat", "Vermelho", 90000);

		System.out.printf("\nA cor do %s é %s", uno.getNome(), uno.getCor());
		System.out.printf("\\nA cor do %s é %s", doblo.getNome(), doblo.getCor());

		uno.printar("Vermelho");
		doblo.printar("Laranja");

		System.out.printf("\nA cor do %s é %s", uno.getNome(), uno.getCor());
		System.out.printf("\nA cor do %s é %s", doblo.getNome(), doblo.getCor());

		System.out.printf("\n~~~~~~~~~~~~~~\n");

		System.out.printf("\nA cor do %s é %s", uno.getNome(), uno.getCor());
		System.out.printf("\nA cor do %s é %s", doblo.getNome(), doblo.getCor());

		System.out.printf("\nDe quanto será o desconto aplicado?");
		float desconto = teclado.nextFloat();
		uno.darDesconto(desconto);
		doblo.darDesconto(desconto);

		System.out.printf("\nA cor do %s é %s", uno.getNome(), uno.getCor());
		System.out.printf("\nA cor do %s é %s", doblo.getNome(), doblo.getCor());

		teclado.close();

	}

}
