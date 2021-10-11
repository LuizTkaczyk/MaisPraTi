package orientacaoObjetos9;

public class Principal {

	public static void main(String[] args) {
		int ini = Tela.retornarInt("Informe um número inteiro");
		int fim = Tela.retornarInt("Informe outro número inteiro");
		
		Pares p = new Pares();
		String res = p.retornaNros(ini, fim);
		Tela.mostrarTxt(res);

	}

}
