package lp20200312;

import static utils.Utils.header;

import java.util.Scanner;

public class Lacos {
	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		//int i = 0;
		header(" repetição ");
		System.out.print("Digite o valor de 'A': ");
		int a = leia.nextInt();
		
		System.out.print("Digite o valor de 'B': ");
		int b = leia.nextInt();
		
		for (; a <= b; a++) {
			System.out.println(a);
		}
		
		// While
		/*
		 * while (i < 1000) { i++; System.out.print(" " + (i < 10 ? "0" + i : i)); if (i
		 * % 10 == 0) { System.out.println(""); } }
		 */

		// do - while
		/*
		 * do { i++; if (i % 2 == 0) { System.out.print(" " + (i < 10 ? "00" + i : (i <
		 * 100 ? "0" + i : i) )); } if (i % 10 == 0) { System.out.println(""); } } while
		 * (i < 100);
		 */
		// FOR

	}

}
