package poo11;

public class Principal {

	public static void main(String[] args) {
		Funcionario func = null;
		
		String nome = Tela.retornaTxt("Nome");
		String email = Tela.retornaTxt("E-mail");
		
		String tipo = Tela.retornaTxt("H - Horista | I - Integral");
		if(tipo.toLowerCase().equals("h")) {
			int qtd  = Tela.retornaInt("Quantidade de horas");
			double val = Tela.retornaDbl("Valor da hora");
			func = new FuncHorista(nome, email, qtd, val);
			
		}
		
		if(tipo.toLowerCase().equals("i")) {
			double sal = Tela.retornaDbl("Sal?rio base");
			func = new FuncIntegral(nome, email, sal);
		}
		
		double sal = func.calcularSalario();
		nome = func.getNome();
		Tela.mostrarTxt(nome + " seu sal?rio ser? : " + sal );

	}
	
	

}

