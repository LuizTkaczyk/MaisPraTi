package testesTipos;

import javax.swing.JOptionPane;

public class TesteRepeticao {
	
	//codigo para receber dois valores inteiros ( inicial e final)
	//e mostrar os numeros pares, e quantidade de pares e a soma deles

	public static void main(String[] args) {
		String inicio = JOptionPane.showInputDialog("Inicial");
		String fim = JOptionPane.showInputDialog("Final");
		int inicio2 = Integer.parseInt(inicio);
		int final2 = Integer.parseInt(fim);
		
		int soma = 0;
		int quantidade = 0;
		String resultado = "";
		for (int n = inicio2; n <final2; n++) {
			if(n % 2 == 0) {
				resultado = resultado + n + "-";
				quantidade++;
				soma= soma + n;
			}
		}
		
		JOptionPane.showMessageDialog(null, resultado);
		JOptionPane.showMessageDialog(null, "Quantidade :" + quantidade);
		JOptionPane.showMessageDialog(null, "Soma :" + soma);

	}

}
