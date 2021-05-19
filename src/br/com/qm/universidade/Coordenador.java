package br.com.qm.universidade;

public class Coordenador extends Funcionario {

	private Professor[] professoresSupervisionados;

	public Coordenador(String nome, String cpf, int nroRegistro, String orgaoLotacao, double salario) {
		super(nome, cpf, nroRegistro, orgaoLotacao, salario);
		this.professoresSupervisionados = new Professor[10];
	}

	public Professor[] getProfessoresSupervisionados() {
		return professoresSupervisionados;
	}



	public void adicionaProfessor(Professor professor) {

		for (int i = 0; i < professoresSupervisionados.length; i++) {

			if (this.professoresSupervisionados[i] == null) {
				this.professoresSupervisionados[i] = professor;
				break;
			}

		}

	}





}
