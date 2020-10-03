import java.util.Scanner;

public class TenarioExercicio 
{

	// Não conclui os demais comandos. Arrumar brevemente!
	
	public static void main(String[] args)
	{
		
		int nome, sexo, feminino = 1 , masculino= 2 ,outros=3;
		
		/* 1 - Masculino
		 * 2 - Feminino
		 * 3 - Outros
		 */
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Coloque seu nome: ");
		nome: leia.nextInt();
		
		System.out.println("Coloque a opçao que defina sua sexualidade: ");
		sexo: leia.nextInt();
		
		System.out.println ((sexo = 1) ? % "\nMasculino" : (sexo = 2) ? % "\nFeminino" : (sexo = 3) ? % "\nOutros");
		
		System.out.println("Seu sexo é: " + sexo);
		
	}

}
