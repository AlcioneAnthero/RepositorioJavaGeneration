package aplicacao;

public class Pessoa {

	private String nome;
	private String endere�o;
	private int telefone;
	
	public Pessoa(String nome) {

		this.nome = nome;
	}

	public Pessoa(String nome, String endere�o) {
		
		this.nome = nome;
		this.endere�o = endere�o;
	}

	public Pessoa(String nome, String endere�o, int telefone) {
		super();
		this.nome = nome;
		this.endere�o = endere�o;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	
	
}
