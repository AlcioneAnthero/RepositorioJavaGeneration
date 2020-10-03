package aplicacao;

public class Funcionario {

	//ATRIBUTOS
		private String nome;
		private int horasTrabalhadas;
		private double valorPorHora;
		
		//CONSTRUTORES
		public Funcionario()  //CONSTRUTOR TEM O MESMO NOME DA CLASSE
		{ // construtor vazio
			
		}
		//SOBRECARGA
		public Funcionario(String nome)
		{
			this.nome = nome;
		}
		public Funcionario(String nome, int horasTrabalhadas, double valorPorHora)
		{
			this.nome = nome;
			this.horasTrabalhadas = horasTrabalhadas;
			this.valorPorHora = valorPorHora;
		}
		// SEGURAÇÃO - ENCAPSULAMENTO - GETTERS E SETTERS 
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
		
		// MEUS METODOS
		
		public double pagamento()
		{
			return this.horasTrabalhadas*this.valorPorHora;
		} // retorna um valor da classe
		
		//SOBRECARGA
		public double pagamento(int horasTrabalhadas, double valorPorHora)
		{
			double recebimento; // aqui ele digita e hora e valor por hora
			recebimento = horasTrabalhadas * valorPorHora;
			
			setValorPorHora(valorPorHora);
			setHorasTrabalhadas(horasTrabalhadas);
			
			return recebimento;
		}
		
		
		

}
