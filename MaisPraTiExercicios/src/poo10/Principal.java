package poo10;

public class Principal {
	//Criando um calculadora simples

	public static void main(String[] args) {
		double n1 = Tela.retornaDbl("Informe um valor");
		double n2 = Tela.retornaDbl("Informe um outro valor");
		String op = Tela.retornaTxt("Opera��o : (+,-,*,/) ");
		
		//a classe Calculador recebe dois numeros duble e uma string, que representa o sinal de opera��o
		double res = Calculadora.exec(n1, n2, op);
		
		Tela.mostrarTxt("Resultado :" + res);

	}

}
