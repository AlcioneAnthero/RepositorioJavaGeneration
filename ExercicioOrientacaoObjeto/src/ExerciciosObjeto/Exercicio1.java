package ExerciciosObjeto;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		System.out.println("Cliente - POO");

		Scanner leia = new Scanner (System.in);
		Cliente primeiroCliente =  new Cliente ();
		
		String nome;
		
		System.out.println("Digite seu nome: ");
		nome = leia.next();
		
		System.out.printf("Seja bem vindo ao nosso Shopping %s",nome.toUpperCase());
		
		System.out.println("\n");
		
		System.out.println("\nDigite a data de nascimento:");
		primeiroCliente.anoNascimentoCliente = leia.nextInt();
		
		System.out.println("Digite o seu sexo: ");
		primeiroCliente.sexoCliente = leia.next().charAt(0);
		
		System.out.println("Digite a sua loja de preferencia do Shopping:");
		primeiroCliente.lojaCliente = leia.next().charAt(0);
		
		primeiroCliente.lojaCliente();
		{
			
			System.out.println("\nAgradecemos a sua preferencia de loja! Volte sempre em nosso Shopping!!");
			
			System.out.println("Gostaria de fazer um cartão de sua loja futuramente? É só nos ligar (0000.0000)! ");
			
			
			
		}
		
		
	}

}
