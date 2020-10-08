package aplicacao;

public class EmpresaX {

	public static void main(String[] args) {
		
		
		System.out.println("CONTROLE EMPRESARIAL - EMPRESA X:"); //EmpresaX
		System.out.println("\n");
		
		Pessoa funcionarioEmpresa = new Pessoa ("Caio - Funcionário"); // Empregado
		Pessoa operarioLogistico = new Pessoa ("João - Operario "); // Operario
		Pessoa administradorCargas = new Pessoa ("Amanda - Administrador(a) "); //Admistrador
		Pessoa pessoaChefe = new Pessoa ("Alcione - Pessoa // Chefa da Empresa"); // pessoa
		
		
		System.out.println(pessoaChefe.getNome());
		
		System.out.println(funcionarioEmpresa.getNome());
		
		System.out.println(operarioLogistico.getNome());
		
		System.out.println(administradorCargas.getNome());
		
		System.out.println("\nAgradecemos por fazerem parte de nossa equipe!");
		
		System.out.println("\nPara feedback sobre a nossa empresa, entre em contato com RH!");
	}

}
