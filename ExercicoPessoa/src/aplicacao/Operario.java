package aplicacao;

public class Operario {

	private int valorProducao;
	private String comissao;
	
	public Operario(int valorProducao) {
		
		this.valorProducao = valorProducao;
	}

	public Operario(int valorProducao, String comissao) {
		
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public int getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(int valorProducao) {
		this.valorProducao = valorProducao;
	}

	public String getComissao() {
		return comissao;
	}

	public void setComissao(String comissao) {
		this.comissao = comissao;
	}

	
}
