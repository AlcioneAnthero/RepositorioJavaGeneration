package ExemploPOO;

import java.util.Scanner;

public class ExemploEscolar {

	/*Criar classe do aluno: nomeAluno[texto/String], anoNascimentoAluno[int], sexoAluno[caracter é char], turmaAluno[caracter é char]
	 */

	public static void main(String[] args) {
		
		System.out.println("Sistema de controle escolar em Java - POO");
		
		Scanner leia = new Scanner (System.in); // abriu o teclado para ler 
		Aluno primeiroAluno = new Aluno(); // instaciou o aluno da outra aba
		
		System.out.println("Digite o nome do aluno: ");
		primeiroAluno.nomeAluno = leia.next().toUpperCase(); // colocar para deixar maiusculo.
		
		
		System.out.println("Qual o sexo do aluno [M/F]: ");
		primeiroAluno.sexoAluno = leia.next().charAt(0);
				
		System.out.println("Digite a nota 1: ");
		primeiroAluno.notas[0] = leia.nextDouble();
		
		System.out.println("Digite o ano de nascimento:");
		primeiroAluno.anoNascimentoAluno = leia.nextInt();
		
				// Vou criar um metodo lá na Classe ALuno.
		
		primeiroAluno.mostra();
		primeiroAluno.mostraIdade();
		
	}

}
