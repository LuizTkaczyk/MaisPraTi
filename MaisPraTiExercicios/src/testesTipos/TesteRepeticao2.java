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
		int idadeTotal = 0;//somador
		int numeroPessoas = 0;//contador
		
		while(resposta.equalsIgnoreCase("sim")) {
			nome = JOptionPane.showInputDialog("Nome:");
			sidade = JOptionPane.showInputDialog("Idade:");
			idade = Integer.parseInt(sidade);
			
			if(idade < novaIdade) {
				novaIdade = idade;// novaIdade ? a idade do 
				novoNome = nome;//novoNome ? o nome do mais novo
			}
			
			idadeTotal = idadeTotal + idade;//somador das idades
			numeroPessoas++;//contador das pessoas
			
			resposta = JOptionPane.showInputDialog("Tem mais algu?m ?");
			
		}
		
		double media = idadeTotal / numeroPessoas;
		JOptionPane.showMessageDialog(null, "Mais novo :" + novoNome);
		JOptionPane.showMessageDialog(null, "Menor idade :" + novaIdade);
		JOptionPane.showMessageDialog(null, "M?dia :" + media);

	}

}
