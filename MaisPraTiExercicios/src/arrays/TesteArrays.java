package arrays;

public class TesteArrays {
	public static void main(String[] args) {
		String [] nomes = new String[3];
		nomes[0] = "Luiz";
		nomes[1] = "Maira";
		nomes[2] = "Antonio";
		
		int [] idades = new int[3];
		idades[0] = 20;
		idades[1] = 30;
		idades[2] = 40;
		
		System.out.println(nomes[1] + " com idade " + idades[1]);
		
		System.out.println("Primeiro for");
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i] + " tem " + idades[i] + " anos de idade");
			
		}
		
		System.out.println("Segundo for");
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i] + " - ");
			
		}
		
		System.out.println("Terceiro for");

		for(String nom: nomes) {
			System.out.println(nom + " -");
		}
		
		System.out.println("Quarto for");
		for(int ida : idades) {
			System.out.println(ida+ " - ");
		}
	
	}

}
