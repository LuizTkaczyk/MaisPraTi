package poo13;

public class ClienteVip extends Cliente {
	double limite = 3000;
	
	public ClienteVip(String n, String e, int i) {
		super(n, e, i);
	}
	
	public void ajustarLimite() {
		this.limite += 1000;
	}
	
	public double retornarLimite() {
		return this.limite;
	}
}
