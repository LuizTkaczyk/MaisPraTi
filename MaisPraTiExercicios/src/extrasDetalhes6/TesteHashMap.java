package extrasDetalhes6;

import java.util.HashMap;
import java.util.Map;

public class TesteHashMap {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Luiz", 32, "luiz@luiz.com");
		Aluno a2 = new Aluno("Ana", 39, "ANA@luiz.com");
		Aluno a3 = new Aluno("Maria", 92, "maria@luiz.com");
		
		
		//para adicionar no map usa o put
		Map<String, Aluno> mapAluno = new HashMap<String, Aluno>();
		//uso com chave - valor
		mapAluno.put("k1", a1);
		mapAluno.put("k2", a2);
		mapAluno.put("k3", a3);
		
		imprimirAlunos(mapAluno);
		
		Aluno resultado = mapAluno.get("k2");
		System.out.println("Aluno da chave 2:" + resultado.getNome());

	}
	
	public static void imprimirAlunos(Map<String, Aluno> aluno) {
		for (Aluno alu: aluno.values()) {
			System.out.println(alu.getNome());
		}
	}

}
