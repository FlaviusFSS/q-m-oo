package br.com.qm.empresa;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Funcionario[] funcionarios = new Funcionario[3];
		funcionarios[0] = new Programador("José", "000000", 2000, 40, "Java", "BE");
		funcionarios[1] = new Programador("Antonio", "00010101", 2000, 40, "Javascript", "FE");

		//Funcionario funcionario = new Programador("José", "000000", 2000, 40, "Java", "BE");

		//funcionario.aumentaSalario();

		for (Funcionario funcionario : funcionarios) {
			funcionario.aumentaSalario();
			System.out.println(funcionario.getSalario());
		}
	}

}
