package extrasDetalhes6;

import java.util.HashSet;
import java.util.Set;

public class TesteHashSet {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Luiz", 32, "luiz@luiz.com");
		Aluno a2 = new Aluno("Ana", 39, "ANA@luiz.com");
		Aluno a3 = new Aluno("Maria", 92, "maria@luiz.com");
		
		
		//n?o permite repetir adi??es
		Set<Aluno> alunos = new HashSet<Aluno>();
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		
		imprimirAlunos(alunos);
		
	}
	
	public static void imprimirAlunos(Set<Aluno> aluno) {
		for (Aluno alu: aluno) {
			System.out.println(alu.getNome());
		}
	}

}
