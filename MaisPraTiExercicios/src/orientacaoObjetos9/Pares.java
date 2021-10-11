package orientacaoObjetos9;

public class Pares {

	public String retornaNros(int ini, int fim) {
		//método que organiza os número do menor para o maior
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
