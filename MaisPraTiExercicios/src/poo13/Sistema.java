package poo13;

import java.util.ArrayList;

public class Sistema {
	private static ArrayList<Cliente> dados = new ArrayList<Cliente>();

	public static void cadastrarCliente() {
		String nome, email, tipo;
		int idade;

		nome = EntradaSaida.receberString("Nome: ");
		email = EntradaSaida.receberString("E-mail: ");
		idade = EntradaSaida.receberInt("Idade :");
		tipo = EntradaSaida.receberString("C ou V");
		Cliente cliente;
		if (tipo.equalsIgnoreCase("V")) {
			cliente = new ClienteVip(nome, email, idade);
		} else {
			cliente = new ClienteComum(nome, email, idade);
		}

		dados.add(cliente);
	}

	public static void pesquisarCliente() {
		String pesquisa = EntradaSaida.receberString("Nome a pesquisar:");
		Cliente cliente = retornarCliente(pesquisa);
		String saida = "";
		if (cliente != null) {
			saida += cliente.retornarNome() + "\n";
			saida += cliente.retornarEmail() + "\n";
			saida += cliente.retornarIdade();
		} else {
			saida = "Nenhum resultado encontrado";
		}

		EntradaSaida.mostrarTexto(saida);
	}

	private static Cliente retornarCliente(String pesquisa) {
		Cliente cliente = null;
		for (int i = 0; i < dados.size(); i++) {
			cliente = dados.get(i);
			String nome = cliente.retornarNome();
			if (nome.equalsIgnoreCase(pesquisa)) {
				return cliente;
			}

		}
		//chegou no final do loop e não retornou nada
		return null;
	}

	//método que aumenta o limite da conta se o cliente for vip
	public static void aumentarLimite() {
		String pesquisa = EntradaSaida.receberString("Cliente ?");
		Cliente cliente = retornarCliente(pesquisa);
		if (cliente != null && cliente instanceof ClienteVip) { //forçar o tipo
			ClienteVip cv = (ClienteVip) cliente;
			cv.ajustarLimite();
			double limite = cv.retornarLimite();
			EntradaSaida.mostrarTexto("Novo limite:" + limite);

		} else {
			EntradaSaida.mostrarTexto("Cliente comum...");
		}
	}
}
