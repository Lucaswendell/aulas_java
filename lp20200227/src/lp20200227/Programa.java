package lp20200227;

import static utils.Utils.*;
import java.util.Scanner;

public class Programa {
	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		header(" media ");
		
		double numero1, 
			numero2, 
			total;
		
		System.out.print("Digite o primeiro valor: ");
		numero1 = leia.nextDouble();
		System.out.print("Digite o segundo valor: ");
		numero2 = leia.nextDouble();
		
		total = (numero1 + numero2) / 2;
		if(total >= 7) {
			System.out.println("Aprovado");	
		}
		
		System.out.println("O resultado da media é: " + total);
	}
}
