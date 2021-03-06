package poo11;

//herdando de funcionario com extends
public class FuncHorista extends Funcionario {

	private int qtd;
	private double val;

	public FuncHorista(String nome, String email, int qtd, double val) {
		// chamando o construtor da classe que foi extendida
		super(nome, email);
		this.qtd = qtd;
		this.val = val;
	}

	public double calcularSalario() {
		double base = (this.qtd * this.val);
		double sal = base - ( base *this.TAXA);

		return sal;
	}

}
