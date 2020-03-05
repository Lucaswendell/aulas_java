package lp20200305;

import java.util.Scanner;

public class Ordem {
	public static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {
		int valor1, valor2;

		System.out.print("Digite o primeiro valor: ");
		valor1 = ler.nextInt();
		System.out.print("Digite o segundo valor: ");
		valor2 = ler.nextInt();
		while (valor1 == valor2) {
			System.out.print("Digite um valor diferentes: ");
			valor2 = ler.nextInt();
		}

		if (valor1 < valor2) {
			System.out.println("Ordem crescente: " + valor1 + " " + valor2);
		} else {
			System.out.println("Ordem crescente: " + valor2 + " " + valor1);
		}
		
		
	}

}
