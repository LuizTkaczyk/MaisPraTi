package poo10;

import javax.swing.JOptionPane;

public class Tela {

	//recebe um texto e retorna um texto
	public static String retornaTxt(String txt) {
		String sval = JOptionPane.showInputDialog(txt);
		return sval;
	}
	
	
	//recebe um n?mero e converte para inteiro
	public static int retornaInt(String txt) {
		String sval = retornaTxt(txt);
		int ival = Integer.parseInt(sval);
		return ival;
	}
	
	//converte um texto em um double
	public static double retornaDbl(String txt) {
		String sval = retornaTxt(txt);
		double dval = Double.parseDouble(sval);
		return dval;
	}
	
	//Exibe uma janela de di?logo
	public static void mostrarTxt(String txt) {
		JOptionPane.showMessageDialog(null, txt);
	}
	
	
	
	
	
	

}
