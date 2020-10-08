package entidades;

import java.util.Scanner;

public class TesteErro {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		
		try
		{
		System.out.println("DIGITE UMA SEQUENCIA DE NOMES");
		String lista[] = leia.nextLine().split(" "); 
		
		
		System.out.println("Escolha a posição da lista: ");
		int posicao = leia.nextInt();
		System.out.println(lista[posicao].toUpperCase());
		
		}
		catch (java.lang.ArrayIndexOutOfBoundsException erro)
		{
			
			for (int i = 0 ; i < 10; i++) 
			{
				System.out.println("\n");
			}
			System.out.println("Voce digitou uma tecla errada");
		}
		System.out.println("FIM DO PROGRAMA");
		leia.close();
		
		leia.close();
		
		
		// Bolinhas verdes são metodos que fazem alguma coisa. Ex: Next.
		
		//String exemplo[] = {"Rafa","Jessica", "Ed"}; // meus nomes, vetores.
		//System.out.println(lista[0]); // posiçoes que eu quero [1] ou [5]
		//System.out.println(lista[1]);
		
	}

}
