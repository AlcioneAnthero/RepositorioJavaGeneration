package Collections;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("MINHA FAZENDINHA DE ANIMAIS AMADOS E ABENÇOADOS: ");
		System.out.println("\n");
		
		Animal primeiroAnimal = new Animal("Sety",10); // Aninal qualquer: Canguru 
		Cavalo primeiroCavalo = new Cavalo("Esmeralda",7); //Cavalo
		Cachorro segundoCachorro = new Cachorro("Snoop",3); //Cachorro
		Preguiça terceiraPreguiça = new Preguiça ("Cadu",12); //Preguiça
	
		System.out.println(primeiroCavalo.getNome()+" " +primeiroCavalo.getIdade());
		System.out.println(segundoCachorro.getNome()+" " +segundoCachorro.getIdade());
		System.out.println(terceiraPreguiça.getNome ()+" " +terceiraPreguiça.getIdade());
		
		primeiroCavalo.som();
		primeiroCavalo.correr();
		segundoCachorro.correr();
		segundoCachorro.som();
		terceiraPreguiça.subirEmArvores();
		terceiraPreguiça.som();
	}

}
