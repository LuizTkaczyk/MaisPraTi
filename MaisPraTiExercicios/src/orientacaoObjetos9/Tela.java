package orientacaoObjetos9;

import javax.swing.JOptionPane;

public class Tela {
	
	public static int retornarInt(String txt) {
		
		//usa o m�todo do Java para abrir uma janela de di�logo
		//Sempre retorna uma String
		String numero = JOptionPane.showInputDialog(txt);
		
		//converter uma string em n�mero
		int num = Integer.parseInt(numero);
		
		return num;
	}
	
	public static void mostrarTxt(String txt) {
		JOptionPane.showMessageDialog(null, txt);
	}
	
	

}
