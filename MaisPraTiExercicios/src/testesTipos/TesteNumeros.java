package testesTipos;

public class TesteNumeros {
	public static void main(String[] args) {
		// Convertendo string em número
		String numero1 = "1234";
		System.out.println("Uma string :" + numero1);
		
		int numero2 = Integer.parseInt(numero1);
		System.out.println("Um int :" + numero2);
		
		float numero3 = Float.parseFloat(numero1);
		System.out.println("Um float :" + numero3);
		
		double numero4 = Double.parseDouble(numero1);
		System.out.println("Um double :" + numero4);

		// Convertendo int em string
		int numero5 = 1234;
		String numero6 = Integer.toString(numero5);
		System.out.println("Um int convertido em string: " + numero6);

		// Funções matemáticas com Math
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.sqrt(25));
		System.out.println(Math.sin(90));
		System.out.println(Math.E);
		System.out.println(Math.PI);

	}
}
