package utils;

import java.util.List;
import java.util.Scanner;

public class Utils {
	public static void header(String text) {
		String equals = "=".repeat(10);
		System.out.println(equals + text + equals);
		System.out.println("");
	}

	public static int menu(List<String> itens) {
		Scanner leia = new Scanner(System.in);
		for (String item : itens) {
			System.out.println("[" + (itens.indexOf(item) + 1) + "] - " + item);
		}
		System.out.print("Escolha uma opção: ");
		int opc = leia.nextInt();
		return opc;

	}
}
