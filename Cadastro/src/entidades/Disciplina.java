package entidades;
public class Disciplina
{
	String nomeDisciplina;
	int nivelDisciplina;
	
	public Disciplina(String nomeDisciplina) {
		super();
		this.nomeDisciplina = nomeDisciplina;
	}

	public Disciplina(String nomeDisciplina, int nivelDisciplina) {
		super();
		this.nomeDisciplina = nomeDisciplina;
		this.nivelDisciplina = nivelDisciplina;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public int getNivelDisciplina() {
		return nivelDisciplina;
	}

	public void setNivelDisciplina(int nivelDisciplina) {
		this.nivelDisciplina = nivelDisciplina;
	}
	
	
}