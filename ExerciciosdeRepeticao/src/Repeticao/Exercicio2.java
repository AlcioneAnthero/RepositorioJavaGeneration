package Repeticao;

import java.util.Scanner;

public class Exercicio2 {
	
	/*
	 * 2 - Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
	 */

	public static void main(String[] args) {
		
		int numero, par=0, impar=0;
		
		for (numero=1;numero<=10;numero++) {
			if ((numero %2) ==0) {
				par = par + 1;
			
			}
			else {
				impar = impar + 1;
			}
			
		}
		
				System.out.printf("Existem %d numeros pares",par);
				System.out.printf(" e %d numero impares.",impar);
		
	}

}
