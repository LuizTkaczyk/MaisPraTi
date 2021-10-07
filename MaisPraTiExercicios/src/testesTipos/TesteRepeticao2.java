package testesTipos;

import javax.swing.JOptionPane;

public class TesteRepeticao2 {

	public static void main(String[] args) {
		String nome;
		String sidade;
		int idade;
		
		String resposta = "sim";
		String novoNome = "";
		int novaIdade = 200;
		int idadeTotal = 0;
		int numeroPessoas = 0;
		
		while(resposta.equalsIgnoreCase("sim")) {
			nome = JOptionPane.showInputDialog("Nome:");
			sidade = JOptionPane.showInputDialog("Idade:");
			idade = Integer.parseInt(sidade);
			
			if(idade < novaIdade) {
				novaIdade = idade;
				novoNome = nome;
			}
			
			idadeTotal = idadeTotal + idade;
			numeroPessoas++;
			
			resposta = JOptionPane.showInputDialog("Tem mais alguém ?");
			
		}
		
		double media = idadeTotal / numeroPessoas;
		JOptionPane.showMessageDialog(null, "Mais novo :" + novoNome);
		JOptionPane.showMessageDialog(null, "Menor idade :" + novaIdade);
		JOptionPane.showMessageDialog(null, "Média :" + media);

	}

}
