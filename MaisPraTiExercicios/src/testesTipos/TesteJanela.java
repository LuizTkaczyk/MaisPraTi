package testesTipos;

import javax.swing.JOptionPane;

public class TesteJanela {

	public static void main(String[] args) {
		String dados;
		
		//exibindo uma caixa de di�logo ao usuario
		dados = JOptionPane.showInputDialog("Digite sua idade.");
		
		//convertendo dados para int
		int idade = Integer.parseInt(dados);
		
		String mensagem = "";
		if(idade >= 18) {
			mensagem = "Ok, voc� � maior de idade.";
		}else {
			mensagem = "Voc� � menor de idade.";
		}
		
		JOptionPane.showMessageDialog(null, mensagem);
				
		
		

	}

}
