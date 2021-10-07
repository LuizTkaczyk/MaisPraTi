package monitor;

public class Monitor {
	private int resolucao;
	private String tipo;
	private String sep;

	public Monitor() {

		this.resolucao = 1024;
		this.tipo = "tubo";
		this.ajustarResolucao(this.resolucao);
	}

	public void ligar() {

		System.out.println("Ligando o monitor...");
		System.out.println("");

	}

	public void desligar() {
		System.out.println("");
		System.out.println("Monitor desligando..., até mais!");

	}

	public void exibirMsg(String txt) {
		System.out.println("");
		System.out.println(this.sep);
		System.out.println("Resolução atual: " + this.resolucao);
		System.out.println(txt);
		System.out.println(this.sep);
		System.out.println("");

	}

	public void ajustarResolucao(int reso) {
		if (reso != 1024 && reso != 1280 && reso != 1600) {
			this.resolucao = 1024;
		} else {
			this.resolucao = reso;
		}
		this.ajustarSep();

	}

	private void ajustarSep() {
		String sep = "";
		int qtd = (int) (this.resolucao / 100);
		for (int i = 0; i < qtd; i++) {
			sep += "-";
		}
		this.sep = sep;
	}

}
