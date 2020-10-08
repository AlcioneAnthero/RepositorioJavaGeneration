package Interface;

public abstract class FiguraGeometrica {

	
	private int base;
	private int altura;
	
	public FiguraGeometrica(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}


	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	

		
}
