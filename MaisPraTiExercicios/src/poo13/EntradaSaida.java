package poo13;

import javax.swing.JOptionPane;

public class EntradaSaida {

	public static void mostrarTexto(String nome) {
		 JOptionPane.showMessageDialog(null, nome);
		
		
	}

	public static String receberString(String email) {
		String entradaEmail = JOptionPane.showInputDialog(email);
		return entradaEmail;
	}

	public static int receberInt(String idade) {
		String entradaIdade = JOptionPane.showInputDialog(idade);
		int idadeC = Integer.parseInt(entradaIdade);
		return idadeC;
	}

}
