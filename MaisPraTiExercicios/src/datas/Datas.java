package datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Datas {

	public static void main(String[] args) {
		Date hoje = new Date();
		System.out.println(hoje);
		
		DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("Hoje � dia : " + fmt.format(hoje));
		
		try {
			String entrada = "10/10/2021";
			DateFormat fmt2 = new SimpleDateFormat("dd/MM/yyyy");
			Date aniversario = fmt2.parse(entrada);
			System.out.println(fmt.format(aniversario));
		}
		catch(Exception e) {
			System.out.println("Formato de data inv�lido");
		}
		

	}

}
