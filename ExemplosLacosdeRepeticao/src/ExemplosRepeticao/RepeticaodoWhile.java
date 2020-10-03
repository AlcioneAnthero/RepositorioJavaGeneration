package ExemplosRepeticao;

import java.util.Scanner;

public class RepeticaodoWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int idade;
		System.out.printf("Entre a sua idade: ");
		idade = leia.nextInt();
		
		do
		{
			System.out.printf("Entre a sua idade: ");
			idade = leia.nextInt();
			
			System.out.printf("Sua idade: %d",idade);
			
			if(idade>=18);
			{
				System.out.printf("\nVocê é de maior..."); 
			}
			else
			{
				System.out.printf("\nVocê é de menor...");
			}
		
			System.out.printf("\nEntre a sua idade: ");
			idade = leia.nextInt();
			
		}while (idade>=1);
	}

}
