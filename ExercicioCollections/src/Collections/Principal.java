package Collections;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("MINHA FAZENDINHA DE ANIMAIS AMADOS E ABEN�OADOS: ");
		System.out.println("\n");
		
		Animal primeiroAnimal = new Animal("Sety",10); // Aninal qualquer: Canguru 
		Cavalo primeiroCavalo = new Cavalo("Esmeralda",7); //Cavalo
		Cachorro segundoCachorro = new Cachorro("Snoop",3); //Cachorro
		Pregui�a terceiraPregui�a = new Pregui�a ("Cadu",12); //Pregui�a
	
		System.out.println(primeiroCavalo.getNome()+" " +primeiroCavalo.getIdade());
		System.out.println(segundoCachorro.getNome()+" " +segundoCachorro.getIdade());
		System.out.println(terceiraPregui�a.getNome ()+" " +terceiraPregui�a.getIdade());
		
		primeiroCavalo.som();
		primeiroCavalo.correr();
		segundoCachorro.correr();
		segundoCachorro.som();
		terceiraPregui�a.subirEmArvores();
		terceiraPregui�a.som();
	}

}
