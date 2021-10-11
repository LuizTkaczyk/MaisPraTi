package poo10;

public class Calculadora {
	
	//a classe Calculador recebe dois numeros duble e uma string, que representa o sinal de operação

	public static double exec(double n1, double n2, String op) {
		
		double res = 0 ; 
		
		if(op.equals("+")) {
			res = n1 + n2;
		}
		
		if(op.equals("-")) {
			res = n1- n2;
		}
		if(op.equals("*")) {
			res = n1 * n2;
		}
		if(op.equals("/")) {
			res = n1 / n2;
		}
		
		return res;
	}

}
