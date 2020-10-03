package Collections;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}

	public void som()
	{
		System.out.println("AU AU AU AU AU AU AU, QUERO FAZER XIXI: ");
	}
	
	public void correr () 
	{
		System.out.println("TRUM TRUM TRUM TRUM, VOLTA AQUI COM A MINHA BOLINHA: ");
	}
}
