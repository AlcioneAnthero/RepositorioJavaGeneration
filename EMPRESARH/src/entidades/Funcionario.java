package entidades;

public class Funcionario {
	
	// Atributos
	private String nome;
	private int horasTrabalhadas;
	private double valorPorHora;
	
	// Construtores
	public Funcionario(String nome, int horasTrabalhadas, double valorPorHora) {
		super();
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorPorHora = valorPorHora;
	}

	// metodo
	public double pagamento() { 
		double pagamento = horasTrabalhadas * valorPorHora;
		return pagamento;
	}
	/* outro tipo de metodo:
	 *  public double pagamento()
	 *   return this.horasTrabalhadas*this.valorPorHota;
	 */
	
	
 // Gets e Setter // Encapsulamento
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}


	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}


	public double getValorPorHora() {
		return valorPorHora;
	}


	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	
	

}
