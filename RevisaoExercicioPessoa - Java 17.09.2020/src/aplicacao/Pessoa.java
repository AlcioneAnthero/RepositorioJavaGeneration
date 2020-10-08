package aplicacao;

public class Pessoa {

	private String nome; //Atributos // 
	private String endereço;
	private int telefone;
	private int idade;
	private char sexo;
	
	public Pessoa(String nome) { //Construtores 
		super();
		this.nome = nome;
	}

	public Pessoa(String nome, String endereço) {
		super();
		this.nome = nome;
		this.endereço = endereço;
	}

	public Pessoa(String nome, String endereço, int telefone) {
		super();
		this.nome = nome;
		this.endereço = endereço;
		this.telefone = telefone;
	}

	public Pessoa(String nome, String endereço, int telefone, int idade) {
		super();
		this.nome = nome;
		this.endereço = endereço;
		this.telefone = telefone;
		this.idade = idade;
	}

	public Pessoa(String nome, String endereço, int telefone, int idade, char sexo) {
		super();
		this.nome = nome;
		this.endereço = endereço;
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

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
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
