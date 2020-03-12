package q12;

import java.util.Scanner;

public class Divisao {
	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		float valor1, valor2;	
		
		System.out.print("Digite o primeiro valor: ");
		valor1 = leia.nextFloat();
		
		System.out.print("Digite o segundo valor[diferente de 0]: ");
		valor2 = leia.nextFloat();
		
		//Verificação do segundo valor
		while(valor2 == 0) {
			System.out.print("Segundo valor igual a 0.Por favor, digite novamente: ");
			valor2 = leia.nextFloat();
		}
		
		System.out.println("A divisão entre " + valor1 + " e " + valor2 + " é: " + (valor1/valor2));
	}
}
