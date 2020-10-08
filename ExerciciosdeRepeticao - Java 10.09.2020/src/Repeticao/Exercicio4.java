package Repeticao;

import java.util.Scanner;

/*
 * FEITO EM SALA DE AULA - 11.09 / JULIO/ALCIONE E EDINILSON.
 * 
 */

public class Exercicio4 {
	
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int numero, par=0,impar=0;
		int contador = 0;
		final int LIMITE = 3;
		
		for (contador = 0; contador < LIMITE; contador++) {
			System.out.printf("Digite o %d numero inteiro: ", contador+1);
			numero = ler.nextInt();
			if( (numero % 2)==0 ) {
				par = par + 1;
			}
			else {
				impar++;
			}
		}
		// numero par
		if (par==0) {
			System.out.println("\nVocê não digitou nenhum numero par!!!");
		}
		else if (par==1)
		{
			System.out.printf("\nVoce digitou um numero par");
		}
		else
		{
			System.out.printf("\nVoce informou %d numeros pares", par);
		}
		
		
		// impares
		if (impar==0)
		{
			System.out.println("\nVocê não digitou nenhum numero impar!!!");
		}
		if (impar==1) {
			System.out.println("\nVoce informou um numero impar");
		}
		else
		{
			System.out.printf("\nVoce informou %d numeros impares",impar);
		}
		
		
		ler.close();
		
	}
}