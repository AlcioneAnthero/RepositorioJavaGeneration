package Exerc�cios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		/*
		 * EXERC�CIO DO DIA 09/09 - LA�OS CONDICIONAIS - EXERC�CIO 3
		 * 
		 * 4 - Fa�a um programa em que permita a entrada de um n�mero qualquer e 
		 * exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a 
		 * raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
		 * 
		 */
	
			 Scanner leia = new Scanner (System.in);
			 
			
			 double numero, raiz , quadrado;
			 
			 System.out.println("Digite um numero: ");	
			 numero = leia.nextDouble();
			 
			 if(numero% 2 == 0)
			 {	 
			   raiz = Math.sqrt(numero);
			   System.out.printf("O numero digitado � %.2f par e sua raiz quadrada �  %.2f",numero,raiz);	 
			 }
			 
			 else
			 {
				quadrado = Math.pow(numero,2);
				System.out.printf("O n�mero digitado � %.2f impar e elevado ao quadrado fica %.2f ",numero,quadrado) ;
			 }
			
			
			
			
			 leia.close();
		
		
		
	}
	
}
