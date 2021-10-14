package poo15;

public class TesteExcecao {

	public static void main(String[] args) {
		// tratando erros de excess�o

		try {
			System.out.println("Valor do parametro que foi enviado: " + args[0]);
		} catch (ArrayIndexOutOfBoundsException erro) {
			System.out.println("Acessao ao array n�o existe");
		} catch (Exception erro) {
			System.out.println("Erro geral:" + erro.getMessage() );
		}
		
		finally {
			System.out.println("Sempre ao dar erro, entra em finally");
		}

	}

}