package ExerciciosMatrizeVetores;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class ExercicioMatriz2 {
	
	/*
	 * Realizado em sala de aula, passei a limpo entendendo os conceitos. Estou estudando para me aperfei�oar.
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner kb = new Scanner (System.in);
		Random sorteio = new Random();
		List<Integer> numerosImpares = new ArrayList();
		List<Integer> numerosPares = new ArrayList();
		
        final int LIMITE=6;
        int[] vetor = new int [6];
        int y=0, somaPares=0, contImpares=0;
        int numeroSorteado=0;
        for(y=0;y<LIMITE;y++)
        {
            numeroSorteado=sorteio.nextInt(20)+1;
            System.out.print(" "+numeroSorteado);
            if(numeroSorteado % 2 == 0)
            {
            	numerosPares.add(numeroSorteado);
            	somaPares=somaPares+numeroSorteado;
            }
            else if(numeroSorteado % 2 != 0)
            {
            	numerosImpares.add(numeroSorteado);
            	contImpares++;
            }
        }
         	
        System.out.println("\n");
        System.out.println("Os numeros pares digitados s�o: "+numerosPares);
        System.out.print("A soma dos numeros pares � igual a: "+somaPares);
        System.out.print("\n");
        System.out.println("Os n�meros �mpares digitados s�o: "+numerosImpares);
        System.out.print("A quantidade de numeros �mpares � de: "+contImpares);
				
		kb.close();		
	}


	}


