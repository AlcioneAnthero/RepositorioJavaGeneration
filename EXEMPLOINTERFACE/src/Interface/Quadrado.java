package Interface;

public class Quadrado extends FiguraGeometrica implements CalculoArea {

	
	//Construtor: S� colocar encima que aparece para clicar 
	public Quadrado(int base, int altura) {
		super(base, altura);
		
	}
	// Eu coloco encima e aparece tamb�m.
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
			System.out.println("n�o � um quadrado");
		}
			
		
	}
}

