package orientacaoObjetos9;

public class Principal {

	public static void main(String[] args) {
		int ini = Tela.retornarInt("Informe um n�mero inteiro");
		int fim = Tela.retornarInt("Informe outro n�mero inteiro");
		
		Pares p = new Pares();
		String res = p.retornaNros(ini, fim);
		Tela.mostrarTxt(res);

	}

}
