package ExercíciosClasses;

/*
 * 
 * EXERCÍCIO DO DIA 08/09 - PASSAR OS EXERCÍCIOS DO PORTUGOL PARA JAVA.
 */

import java.util.Scanner;

public class Exercícios {
	public static void main(String args [])
	{
		
		Scanner kb = new Scanner(System.in);
		
		double a,b,c,d,e,f,x,y;
		
		System.out.println("Entre com o valor de A: ");
		a = kb.nextDouble();
		System.out.println("Entre com o valo de B: ");
		b = kb.nextDouble();
		System.out.println("Entre com o valor de C: ");
		c = kb.nextDouble();
		System.out.println("Entre com o valo de D: ");
		d = kb.nextDouble();
		System.out.println("Entre com o valor de E: ");
		e = kb.nextDouble();
		System.out.println("Entre com o valo de F: ");
		f = kb.nextDouble();
		
		x = (c*e - b*f)/(a*e - b*d);
		y = (a*f - c*d)/(a*e - b*d);
		
		
		System.out.printf("\nValor de X: %.2f",x);
		System.out.printf("\nValor de Y: %.2f",y);
		kb.close();

		
		
	}
}
