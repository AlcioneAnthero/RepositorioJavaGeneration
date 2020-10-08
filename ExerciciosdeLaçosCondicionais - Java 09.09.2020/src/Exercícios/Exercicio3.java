package Exercícios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		/*
		 * EXERCÍCIO DO DIA 09/09 - LAÇOS CONDICIONAIS - EXERCÍCIO 3
		 * 
		 * 4 - Faça um programa em que permita a entrada de um número qualquer e 
		 * exiba se este número é par ou ímpar. Se for par exiba também a 
		 * raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
		 * 
		 */
	
			 Scanner leia = new Scanner (System.in);
			 
			
			 double numero, raiz , quadrado;
			 
			 System.out.println("Digite um numero: ");	
			 numero = leia.nextDouble();
			 
			 if(numero% 2 == 0)
			 {	 
			   raiz = Math.sqrt(numero);
			   System.out.printf("O numero digitado é %.2f par e sua raiz quadrada é  %.2f",numero,raiz);	 
			 }
			 
			 else
			 {
				quadrado = Math.pow(numero,2);
				System.out.printf("O número digitado é %.2f impar e elevado ao quadrado fica %.2f ",numero,quadrado) ;
			 }
			
			
			
			
			 leia.close();
		
		
		
	}
	
}
