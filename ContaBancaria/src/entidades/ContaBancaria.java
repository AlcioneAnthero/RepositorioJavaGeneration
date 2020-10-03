package entidades;

public abstract class ContaBancaria {

	private int numero;
	private double saldo;
	
	public ContaBancaria(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	@Override
	public void emiteExtrato() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void credite() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void debite() {
		// TODO Auto-generated method stub
		
	}	
	
}
	
