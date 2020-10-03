package aplicacao;
import entidades.Disciplina;
import entidades.Aluno;
import entidades.Pessoa;
import entidades.Professor;

public class Cadastro {
	public static void main(String[] args)
	{
		
		System.out.println("SISTEMA DE CADASTRO: ");
		
		Pessoa fulano = new Pessoa("João");
		Pessoa sicrano = new Pessoa("Maria",'F',2000);
		Aluno novoAluno = new Aluno("Carlos",'M',2000,"Branco","Turma8");
		Professor novoProfessor = new Professor("Luiza","Modulo II");
		
		
		
		System.out.println(novoAluno.getTurma());
		
		System.out.println(novoProfessor.getNome());
		
	
		
	}
}
