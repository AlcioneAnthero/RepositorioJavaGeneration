package entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal2
{
	public static void main(String[] args)
	{
		// Digite o numero de funcionarios para cadastro:
		// quantos funcionarios ?? 1,2,3   <----- ArrayList - tipo funcionario
		// cada funcionario é um objeto
		// lance os dados por objeto
		// pedi o nome --> nome
		//pedi horas
		// valor por hora
		// e os terceiros??? tem quer pra terceiro
		// horas adicionais
		
		
		// INTERFACE -- List // ArrayList
		
		// mostra nome - salario do funcionario
		
		//variaveis
		int n;
		char ch;
		String nome;
		int hora;
		double valorHora;
		double valorExtra;
		
		
		Scanner leia = new Scanner (System.in); // CTRL - SHIF + O : Importa todas as ja 
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.println("Digite um numero de funcionario: ");
		n = leia.nextInt();
		
		for (int i = 1; i<=n; i++) {
			
			System.out.println("CADASTRO FUNCIONARIO "+i+" :");
			System.out.println("Terceiro [S/N] :");
			ch = leia.next().toUpperCase().charAt(0);
			System.out.println("Nome: ");
			nome = leia.next();
			System.out.println("Hora trabalhadas: ");
			hora = leia.nextInt();
			System.out.println("Valor da hora trabalhada: ");
			valorHora = leia.nextDouble();
		
			if (ch == 'S') { // ' ' é Caracter
			
				System.out.println("Digite o valor extra adicional");
				valorExtra = leia.nextDouble();
				
				// Terceiro exemplo1 = new Terceiro(nome, horas, valorHora, valorExtra) 
				list.add(new Terceiro (nome, hora, valor, valorextra));
		}
			else
			{
				list.add(new Funcionario(nome, hora, valor));
			}
		
		}
	System.out.println();
	System.out.println("PAGAMENTOS");
	for (Funcionario func : list) // for each
	{
		System.out.println(func.getNome()+ " "+func.pagamento());
	}

	}
}