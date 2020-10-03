package ExerciciosObjeto;

import java.util.Scanner;

public class Exercicio3Paciente {

	public static void main(String[] args) {
		
		System.out.println("Levantamento da ficha do(a) Paciente: ");
		
		Scanner leia = new Scanner (System.in);
		Paciente primeiroPaciente = new Paciente();
		
		String nome;
		
		System.out.println("Digite seu nome: ");
		nome = leia.next();
		
		System.out.printf("Bem vindo ao Hospital %s",nome.toUpperCase());
		
		System.out.println("\n");
		
		System.out.println("\nDigite o ano de seu nascimento:");
		primeiroPaciente.anoNascimentoPaciente = leia.nextInt();
		
		System.out.println("Informe o quarto em que estava internado(a), UTI ou Quarto normal:");
		primeiroPaciente.localInternado = leia.next().charAt(0);
		
		
		System.out.println("\nInforme se foi diagnosticada com COVID-19:");
		primeiroPaciente.coronaVirus = leia.next().charAt(0);
		
		System.out.println("\nCom qual nota voc� avaliaria seu atendimento? 0 � 10");
		primeiroPaciente.notaAtendimento = leia.nextDouble();
		
		System.out.printf("\nGostaria de nos dar sugest�es e ou/ observa��es?",nome.toUpperCase());
		primeiroPaciente.sugestoesAtendimento = leia.next().charAt(0);
		
		System.out.println("\nPoderia nos informar seu telefone celular ou fixo? Com DDD (Obrigat�rio e sem pontua��es.)");
		primeiroPaciente.numeroContato = leia.nextDouble();
		
		System.out.println("\nMuito bem! Agradecemos suas informa��es, entraremos em contato com voc� em 24h!");
		System.out.println("\nQualquer d�vida ou socorro, entre em contato por 0000.0000");
		
		primeiroPaciente.fichaCliente();
		

	}

}
