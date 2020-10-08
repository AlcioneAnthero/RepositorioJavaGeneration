package MetodoPOO;

public class Aluno {

	public String nomeAluno;
	public int anoNascimentoAluno;
	public char turmaAluno;
	public boolean negro; //verdadeira ou falso, true ou false.
	public char sexo;
	public double nota1, nota2;
	
	public void mostra() // criando um metodo
	{
		System.out.printf("Nome do aluno: "+nomeAluno.toUpperCase());
		
		System.out.printf("Media do aluno: %.2f", (nota1+nota2)/2);
	}
		
	
	
}
