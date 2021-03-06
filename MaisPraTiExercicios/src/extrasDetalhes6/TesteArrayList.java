package extrasDetalhes6;

import java.util.ArrayList;
import java.util.List;

public class TesteArrayList {

	public static void main(String[] args) {
		Aluno[] vetorAluno = new Aluno[3];
		vetorAluno[0] = new Aluno("Luiz", 32, "luiz@luiz.com");
		vetorAluno[1] = new Aluno("Ana", 39, "ANA@luiz.com");
		vetorAluno[2] = new Aluno("Maria", 92, "maria@luiz.com");
		
		System.out.println("Segundo aluno cadastrado: "+ vetorAluno[1].getNome());
		
		System.out.println("---------------------------------");
		
		//alguns objetos
		Aluno a1 = new Aluno("Jo?o", 17, "jao@email.com");
		Aluno a2 = new Aluno("Carlos", 57, "carlos@email.com");
		Aluno a3 = new Aluno("Denis", 36, "denis@email.com");
		
		
		List listaAlunos1 = new ArrayList();
		
		
		//ao criar um array desta forma, n?o ? necess?rio informar o tamanho do array, como no 1? exemplo
		List<Aluno> listaAlunos2 = new ArrayList<Aluno>();
		//adicionando os nomes ao array listaAlunos2
		listaAlunos2.add(a1);
		listaAlunos2.add(a2);
		listaAlunos2.add(a3);
		
		Aluno objeto = listaAlunos2.get(1);
		
		System.out.println("Segundo aluno cadastrado :" + objeto.getNome());
		
		imprimirAlunos(listaAlunos2);
		

	}
	
	public static void imprimirAlunos(List<Aluno>lista) {
		for (Aluno alu: lista) {
			System.out.println("Nome do aluno: " + alu.getNome());
		}
	}

}
