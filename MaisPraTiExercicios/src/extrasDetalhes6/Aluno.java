package extrasDetalhes6;

public class Aluno {
	
	private String nome;
	private Integer idade;
	private String email;
	
	
	
	public Aluno() {
		this.nome = "Aluno";
		this.idade = 0;
		this.email = "E-mail não cadastrado.";
	}
	
	
	
	public Aluno(String nome, Integer idade, String email) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.email = email;
	}



	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
