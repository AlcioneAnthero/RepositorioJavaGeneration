package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class EstoqueLoja {

	public static void main(String[] args) {
		
		Collection<String> estoque = new ArrayList();
		 
		estoque.add("Arroz");
		estoque.add("Feijão");
		estoque.add("Açucar");
		estoque.add("Café");
		estoque.add("Leite");
		
		System.out.println("Estoque Loja de alimentos: "+estoque);
		
		/* (APRESENTAR TODOS OS DADOS)
		System.out.println("Estoque Loja de alimentos: "+estoque);
		*/
		
		// ------------------------------------------//
		
		/* (INVENTÁRIO DA LOJA: VAZIA OU CHEIA
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
		
		/* (INVENTÁRIO DO ESTOQUE) / (ATUALIZAR OS DADOS)
		System.out.println("Contém no estoque Arroz?  "+estoque.contains("Arroz"));
		System.out.println("Estoque: "+estoque);
		*/
		
		// -------------------------------------------------//
		
		/* (ATUALIZAR DADOS DA LIST)
		Collection<String> estoque2 = Arrays.asList("Macarrão","Bolacha");
		estoque.addAll(estoque2);
		System.out.println("Estoque Loja de alimentos: "+estoque);
		*/
	}
	
	
}

