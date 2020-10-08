package aplicacao;

public class Empregado {

	private String codigoSetor;
	private int salarioBase;
	
	public Empregado(String codigoSetor) {
		
		this.codigoSetor = codigoSetor;
	}

	public Empregado(String codigoSetor, int salarioBase) {
		super();
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
	}

	public String getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(String codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public int getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(int salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	
}
