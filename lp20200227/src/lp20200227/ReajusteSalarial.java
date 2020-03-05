package lp20200227;

import static utils.Utils.*;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ReajusteSalarial {
	public static Scanner leia = new Scanner(System.in);
	public static NumberFormat format = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
	
	public static void main(String[] args) {
		float salarioAtual, salarioFinal = 0, reajuste;
		header(" Reajuste salarial ");
		
		System.out.print("Digite o valor do seu salario: ");
		salarioAtual = leia.nextFloat();
		if(salarioAtual <= 500) {
			
			reajuste = (float)(salarioAtual * 0.15);
			salarioFinal = (float)(salarioAtual + reajuste);
			System.out.println("Seu reajuste foi de " + format.format(reajuste));
			
		}else if(salarioAtual > 500 && salarioAtual <= 1000) {
			
			reajuste = (float)(salarioAtual * 0.10);
			salarioFinal = (float)(salarioAtual + (salarioAtual * 0.10));
			System.out.println("Seu reajuste foi de " + format.format(reajuste));
			
		}else {
			
			reajuste = (float)(salarioAtual * 0.05);
			salarioFinal = (float)(salarioAtual + (salarioAtual * 0.05));
			System.out.println("Seu reajuste foi de " + format.format(reajuste));
			
		}
		System.out.println("Seu salario final será de: " + format.format(salarioFinal));
	}
}
