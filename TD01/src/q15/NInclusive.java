package q15;

import java.util.Scanner;

public class NInclusive {	
	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n;
		
		System.out.print("Digite um valor para N[maior que 0]: ");
		n = leia.nextInt();
		
		while (n <= 0) {
			System.out.print("Valor de N tem que ser maior que 0: ");
			n = leia.nextInt();
		}
		
		for(int i = 1; i <= n; i++) {
			System.out.print(((i < 10) ? ("0" + i) : i) + " ");
			
			if(i % 10 == 0) {
				System.out.println("");
			}
		}
	}

}
