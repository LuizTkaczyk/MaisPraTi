package testesTipos;

public class TesteString {
	public static void main(String[] args) {
		String texto1 = "Testando o primeiro texto.";
		//String texto2 = new String("Outro texto de testes");

		System.out.println(texto1.toUpperCase());// em letra maiuscula
		System.out.println(texto1.substring(5, 10));// da 5� letra at� a 10� letra
		System.out.println(texto1.equals("palavra"));// se existe a palavra "palavra"
		System.out.println(texto1.charAt(15));// qual a 15� letra

		String[] vetor = texto1.split(" "); //dividindo a frase tendo como referencia os espa�os
		System.out.println(vetor[2]); //mostrando a 2 palavra da frase, iniciada em 0
	}

}
