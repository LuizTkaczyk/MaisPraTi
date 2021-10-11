package poo11;

//herdando de funcionario com extends
public class FuncIntegral extends Funcionario {
	
	private double base;
	
	
	
	public FuncIntegral (String nome, String email, double base) {
		super(nome, email);
		this.base = base;
	}
	
	public double calcularSalario() {
		double sal = this.base - this.base * this.TAXA;
	

		return sal;
	}


}
