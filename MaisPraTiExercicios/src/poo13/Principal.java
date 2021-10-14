package poo13;

public class Principal {

	public static void main(String[] args) {
		String res = "sim";
		int opt = 0;

		while (res.equalsIgnoreCase("sim")) {
			opt = EntradaSaida.receberInt("1: cac, 2: pesq, 3: limite");
			switch (opt) {
			case 1:
				Sistema.cadastrarCliente();
				break;
			case 2:
				Sistema.pesquisarCliente();
				break;
			case 3:
				Sistema.aumentarLimite();
				break;
			default:
				EntradaSaida.mostrarTexto("Inválida");

			}
		}
		
		res = EntradaSaida.receberString("Continuar:");

	}

}
