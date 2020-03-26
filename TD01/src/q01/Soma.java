package q01;
import java.util.Scanner;

public class Soma {
	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		int valor1, valor2, total;
		
		System.out.print("Digite o primeiro valor: ");
		valor1 = leia.nextInt();
		System.out.print("Digite o segundo valor: ");
		valor2 = leia.nextInt();
		
		total = valor1 + valor2;
		
		System.out.println("O resultado da soma é: " + total);

	}

}
