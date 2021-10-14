package poo13;

public abstract class Cliente {
	
	private String nome;
	private String email;
	private int idade;
	
	public Cliente() {
		this.nome = "";
		this.email = "";
		this.idade = 0;
				
	}
	
	
	public Cliente(String nome, String email, int idade) {
		super();
		this.nome = nome;
		this.email = email;
		this.idade = idade;
	}
	
	
	public String retornarNome() {
		return nome;
	}
	public void ajustarNome(String nome) {
		this.nome = nome;
	}
	public String retornarEmail() {
		return email;
	}
	public void ajustarEmail(String email) {
		this.email = email;
	}
	public int retornarIdade() {
		return idade;
	}
	public void ajustarIdade(int idade) {
		this.idade = idade;
	}
	
	

}
