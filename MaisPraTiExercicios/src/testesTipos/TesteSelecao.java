package testesTipos;

import javax.swing.JOptionPane;

public class TesteSelecao {

	public static void main(String[] args) {
		String dados;
		dados = JOptionPane.showInputDialog("Informa a sua idade");
		int idade = Integer.parseInt(dados);
		
		String mensagem = "";
		
		if (idade < 5 || idade > 70) {
			mensagem = "Idade n?o permitida";
		}else if(idade >= 5 && idade <= 12) {
			mensagem="Categoria infantil";
		}else if(idade >= 13 && idade <= 20){
			mensagem ="Categoria juvenil";
		}else if(idade >= 21 && idade <= 45) {
			mensagem = "Categoria adulto";
		}else  {
			mensagem = "Categoria Master race";
		}
		
		JOptionPane.showMessageDialog(null, mensagem);

	}

}
