package aplicacao;

public class Pessoa {

	private String nome; //Atributos // 
	private String endere�o;
	private int telefone;
	private int idade;
	private char sexo;
	
	public Pessoa(String nome) { //Construtores 
		super();
		this.nome = nome;
	}

	public Pessoa(String nome, String endere�o) {
		super();
		this.nome = nome;
		this.endere�o = endere�o;
	}

	public Pessoa(String nome, String endere�o, int telefone) {
		super();
		this.nome = nome;
		this.endere�o = endere�o;
		this.telefone = telefone;
	}

	public Pessoa(String nome, String endere�o, int telefone, int idade) {
		super();
		this.nome = nome;
		this.endere�o = endere�o;
		this.telefone = telefone;
		this.idade = idade;
	}

	public Pessoa(String nome, String endere�o, int telefone, int idade, char sexo) {
		super();
		this.nome = nome;
		this.endere�o = endere�o;
		this.telefone = telefone;
		this.idade = idade;
		this.sexo = sexo;
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
	
}
