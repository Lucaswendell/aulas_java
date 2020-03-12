package q17;

import java.util.Scanner;

public class TabudaN {
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int n;
		
		System.out.print("Digite um número: ");
		n = leia.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i + " X "+ n +" = " + (n*i));
		}
	}
}
