package Repeticao;

import java.util.Scanner;

public class Exercicio3 {
	
	/* 
	 * Uma empresa desenvolveu uma pesquisa para saber
	 *  as caracter�sticas psicol�gicas dos indiv�duos de
	 *   uma regi�o. Para tanto, a cada uma das pessoas 
	 *   era perguntado: idade, sexo (1-feminino / 2-masculino),
	 *   e as op��es (1, se a pessoa era calma; 2, se a 
	 *   pessoa era nervosa e 3, se a pessoa era agressiva). 
	 *   Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, 
	 *   calcule e mostre: (WHILE)

			o n�mero de pessoas calmas; 
			o n�mero de mulheres nervosas; MULHERES
			o n�mero de homens agressivos; S� HOMENS
			o n�mero de pessoas nervosas com mais de 40 anos; PESSOAS
			o n�mero de pessoas calmas com menos de 18 anos. PESSOAS

	 */

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, sexo, temperamento;
		int individuos = 0, mulherNervosa = 0, calma = 0, homemAgressivo = 0, pessoaCalma = 0, pessoaNervosa = 0;
		
		while (individuos <3) {
			System.out.println("Idade do individuo: ");
			idade = leia.nextInt();
			
			System.out.println("Sexo:  \n - Masculino \n2- Feminino: ");
			sexo = leia.nextInt();
			
			System.out.println("Temperamento: \n1 - Calmo\n2 - Nervoso\n3 - Agressivo");
			temperamento = leia.nextInt();
			
			if (temperamento == 1) {
				
				calma ++;
				if (idade <18) {
					pessoaCalma++;
				
			}
			
		}
		else if (sexo == 1 && temperamento == 3) {
			homemAgressivo++;
			
		}
		else if (idade > 40 && temperamento == 2) {
			pessoaNervosa++;
			if (sexo ==2) {
				mulherNervosa++;
				
			}	
	}

			individuos++;
		}
		
		System.out.printf("\nNumero de pessoas calmas: %d",calma);
		System.out.printf("\nNumero de mulheres nervosas %d",mulherNervosa);
		System.out.printf("\nNumeros de homens agressivos: %d",homemAgressivo);
		System.out.printf("\nNumeros de pessoas nervosas com mais de 40 anos %d",pessoaNervosa);
		System.out.printf("\nNumeros de pessoas calmas menores de 18 anos: %d",pessoaCalma);
		
		
	}
}
