package orientacaoObjetos9;

public class Pares {

	public String retornaNros(int ini, int fim) {
		//m�todo que organiza os n�mero do menor para o maior
		if (ini > fim) {
			int aux = ini;
			ini = fim;
			fim = aux;
		}

		String res = "";
		for (int n = ini; n <= fim; n++) {
			if (n % 2 == 0) {
				res = res + n + " - ";
			}
		}

		return res;
	}

}
