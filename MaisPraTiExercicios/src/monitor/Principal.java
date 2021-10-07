package monitor;

public class Principal {

	public static void main(String[] args) {
		Monitor aoc = new Monitor();

		aoc.ligar();
		aoc.exibirMsg("Ligando monitor");

		aoc.ajustarResolucao(1600);
		aoc.exibirMsg("Monitor ligado");
		aoc.desligar();
	}

}
