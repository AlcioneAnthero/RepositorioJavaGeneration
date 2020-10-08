package MetodoPOO;

import java.util.Scanner;

public class ExemploPOO {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		Aluno primeiroAluno = new Aluno(); // instanciei o aluno
			
		
		String nome;
		
		System.out.println("Sistema de controle escolar");
	
		System.out.printf("Digite seu nome: ");
		nome = leia.next();
		
		System.out.printf("Seja bem vindo %s",nome.toUpperCase()); // deixar em letra maiuscula

		
		System.out.println("Digite o nome do aluno: ");
		primeiroAluno.nomeAluno = leia.next();
		
		System.out.println("Qual o sexo do aluno:");
		primeiroAluno.sexo = leia.next().charAt(0);
		
		System.out.println("Digite a nota 1:");
		primeiroAluno.nota1 = leia.nextDouble();
		
		System.out.println("Digite a nota 2:");
		primeiroAluno.nota2 = leia.nextDouble();
		
		// chamar o metodo
		primeiroAluno.mostra();
		
		// tirar para dar exemplo // depois colocar
		//System.out.printf("\nNome aluno: %s",primeiroAluno.nomeAluno);
		//System.out.printf("\nMedia do aluno: %.2f",(primeiroAluno.nota1+primeiroAluno.nota2)/2);
		
		
	}

}
