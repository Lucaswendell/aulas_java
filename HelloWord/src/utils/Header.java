package utils;

import java.util.Scanner;
import java.util.ArrayList;

public class Header {
	public static Scanner leia = new Scanner(System.in);

	public static void header(String title) {
		String equals = "=".repeat(10);

		System.out.println(equals + " " + title + " " + equals);
	}

	public static int menu(ArrayList<String> opcs) throws Exception{
		
			if(opcs.isEmpty()) {
				throw new NullPointerException("Nenhum valor no array");
			}
			
			
			for (String opc : opcs) { 
				System.out.println("[ " + (opcs.indexOf(opc) + 1) +" ] " +  opc);
			}
			
			System.out.print("Escolha uma opção: ");
			int opc = leia.nextInt();

			if(opc > opcs.size() || opc <= 0) {
				throw new IndexOutOfBoundsException("Opção invalida. Por favor, excecute o programa novamente.");
			}
			
		return ( opc - 1 );
	}

}
