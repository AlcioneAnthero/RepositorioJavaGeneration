package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class EstoqueLoja {

	public static void main(String[] args) {
		
		Collection<String> estoque = new ArrayList();
		 
		estoque.add("Arroz");
		estoque.add("Feij�o");
		estoque.add("A�ucar");
		estoque.add("Caf�");
		estoque.add("Leite");
		
		System.out.println("Estoque Loja de alimentos: "+estoque);
		
		/* (APRESENTAR TODOS OS DADOS)
		System.out.println("Estoque Loja de alimentos: "+estoque);
		*/
		
		// ------------------------------------------//
		
		/* (INVENT�RIO DA LOJA: VAZIA OU CHEIA
		if (estoque.isEmpty()) 
		{
			System.out.println("Lista vazia...");
		}
		else 
		{
			System.out.println("Lista de produtos no estoque: "+estoque);
		}
		*/
		
		// ----------------------------------------------//
		
		/* (REMOVER DADOS DA LISTA)
		System.out.println("Estoque Loja de alimentos: "+estoque);
		estoque.remove("Arroz");
		System.out.println("Estoque Loja de alimentos: "+estoque);
		*/
		
		// -----------------------------------------------//
		
		/* (INVENT�RIO DO ESTOQUE) / (ATUALIZAR OS DADOS)
		System.out.println("Cont�m no estoque Arroz?  "+estoque.contains("Arroz"));
		System.out.println("Estoque: "+estoque);
		*/
		
		// -------------------------------------------------//
		
		/* (ATUALIZAR DADOS DA LIST)
		Collection<String> estoque2 = Arrays.asList("Macarr�o","Bolacha");
		estoque.addAll(estoque2);
		System.out.println("Estoque Loja de alimentos: "+estoque);
		*/
	}
	
	
}

