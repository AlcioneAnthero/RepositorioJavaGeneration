package ExerciciosObjeto;

import java.util.Scanner;

public class Exercicio2Funcionario {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		Funcionario primeiroFuncionario = new Funcionario ();
		
		String nome;
		
		System.out.println("Sistema de feedback da empresa com o funcionario:");
		
		System.out.println("Digite seu nome: ");
		nome = leia.next();
				
		System.out.printf("Seja bem vindo a nossa empresa %s",nome.toUpperCase());
		
		System.out.println("\nDigite o ano do seu nascimento: ");
		primeiroFuncionario.anoNascimentoFuncionario = leia.nextInt();
		
		System.out.println("Digite seus anos trabalhados na empresa: ");
		primeiroFuncionario.anosTrabalhado = leia.nextInt();
		
		System.out.println("Digite um nota avaliativa sobre a nossa empresa: ");
		primeiroFuncionario.notaParaEmpresa = leia.nextDouble();
		
		System.out.printf("Muito bem, vamos avaliar a sua pontua��o e entrar em contato com voc� %s",nome.toUpperCase());
		System.out.println("\nAgradecemos por fazer parte de nossa equipe. A uni�o faz a for�a!");
		
		primeiroFuncionario.funcionarioEmpresa();
		

	}

}
