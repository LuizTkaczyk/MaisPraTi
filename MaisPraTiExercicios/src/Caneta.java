public class Caneta {
	
	String cor; //para referenciar essa variavel, usa-se o this na classe
	int tamanhoPonta;
	
	public void escrever(String texto) {
		System.out.println(texto);
		
	}
	
	public void ajustarCor(String cor) {
		this.cor = cor;
		System.out.println(this.cor);
	}
	
	public void ajustarTamanho(int tamanho) {
		this.tamanhoPonta = tamanho;
		System.out.println(this.tamanhoPonta);
	}
	

	
}
