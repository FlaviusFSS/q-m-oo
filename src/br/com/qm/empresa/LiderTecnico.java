package br.com.qm.empresa;

public class LiderTecnico extends Funcionario {

	private Programador[] programadaoresSupervisionados;

	public LiderTecnico(String nome, String cpf, double salario, double horasSemanais) {
		super(nome, cpf, salario, horasSemanais);
		int qtdProgramadores = 0;
		this.programadaoresSupervisionados = new Programador[qtdProgramadores];
	}

	public Programador[] getProgramadaoresSupervisionados() {
		return programadaoresSupervisionados;
	}

	public void insereProgramador(Programador programador) {

		for (int i = 0; i < this.programadaoresSupervisionados.length; i++) {
			if (this.programadaoresSupervisionados[i] == null) {
				this.programadaoresSupervisionados[i] = programador;
				break;
			}
		}

	}

	public void imprimeNomesProgramadores() {

		for (Programador programador : this.programadaoresSupervisionados) {
			if (programador != null) {
				System.out.println(programador.getNome());
			}
		}
	}


	@Override
	public void aumentaSalario() {
		super.setSalario(super.getSalario() * 1.1);
	}




}
