package ExemploPOO;

public class Aluno {
	
	/*Criar classe do aluno:
	 * nomeAluno[texto/String],
	 *  anoNascimentoAluno[int], 
	 * sexoAluno[caracter é char], 
	 * turmaAluno[caracter é char]
	 * 
	 */

	public String nomeAluno;
	public int anoNascimentoAluno;
	public char sexoAluno;
	public char turmaAluno;
	public double notas[] = new double[4];
	
	// metodos
	
	public void mostra() {
		
		if (sexoAluno == 'M')
		{
			System.out.printf("O nome do aluno é %s do sexo %s", nomeAluno, sexoAluno);	
		}
		else if (sexoAluno == 'F')
		{
			System.out.printf("O nome do aluna é %s do sexo %s", nomeAluno, sexoAluno);		
		}
		
		}
	public void mostraIdade() { //pode colocar sem o public tambem
		System.out.printf("A sua idade é: %d ", (2020-this.anoNascimentoAluno));
	}
	
	
}
