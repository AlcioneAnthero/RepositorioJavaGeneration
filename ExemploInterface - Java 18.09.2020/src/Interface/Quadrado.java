package Interface;

public class Quadrado extends FiguraGeometrica implements CalculoArea {

	
	//Construtor: Só colocar encima que aparece para clicar 
	public Quadrado(int base, int altura) {
		super(base, altura);
		
	}
	// Eu coloco encima e aparece também.
	@Override
	public double calculoArea() 
	{
		
		int resultado = getBase()* getAltura();
		if (getBase() == getAltura())
		{
			System.out.println(resultado);
		} 
		else 
		{
			System.out.println("não é um quadrado");
		}
			
		
	}
}

