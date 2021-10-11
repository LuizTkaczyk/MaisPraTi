package poo11;

public abstract class Funcionario {
	
	//constante (final) que pode ser acessada dentro da estrutura hierárquica (protected)
	protected final double TAXA = 0.10;
	private String nome;
	private String email;
	
	
	
	public Funcionario(String nome, String email) {
		this.email = email;
		this.nome = nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}


	public String retornarNome() {
		// TODO Auto-generated method stub
		return null;
	}

	//metodo modelo para ser obrigatoriamente implementado nas subclasses ( classes que herdam Funcionario)
	public abstract double calcularSalario();
}
