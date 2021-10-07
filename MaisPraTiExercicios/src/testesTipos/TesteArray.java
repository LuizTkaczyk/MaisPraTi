package testesTipos;

import java.util.ArrayList;

public class TesteArray {
	public static void main(String[] args) {
		String[] nomes = new String[5];
		nomes[0] = "Luiz";
		nomes[1] = "Maria";
		nomes[2] = "Chico";
		
		int[] idades = new int[5];
		idades[0] = 30;
		idades[1] = 35;
		idades[2] = 40 ;
		
		System.out.println(nomes[1]+" com idade de : "+idades[1]);
		
		
		System.out.println("******************************************************");
		
		
		ArrayList vetor = new ArrayList();
		vetor.add("Testando ArrayList 1");//este é o item 0.
		vetor.add("Testando ArrayList 2");//este é o item 1.
		vetor.add(1234);//esté é o item 2
		System.out.println("Quantidade de elementos :" + vetor.size());
		System.out.println(vetor.get(1)); // pegando o item 1 do vetor
		
	}
}
