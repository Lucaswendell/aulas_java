import java.text.NumberFormat;
import java.util.Scanner;

public class PercentualCarro {
	public static Scanner leia = new Scanner(System.in);
	public static NumberFormat format = NumberFormat.getCurrencyInstance();
	
	public static void main(String args[]) {
		float distribuidor = (float) 0.28;
		float imposto = (float) 0.45;
		float custoFinal, custoFabrica, percentualDistribuidor, percentualImporto;
		
		System.out.print("Digite o valor de fabrica do carro: ");
		custoFabrica = leia.nextFloat();
		
		System.out.println("");
		System.out.println("Calculando ...");
		System.out.println("");
		
		percentualDistribuidor = custoFabrica * distribuidor;
		percentualImporto = custoFabrica * imposto;
		custoFinal = custoFabrica + percentualDistribuidor + percentualImporto;
		
		System.out.println("O custo final do carro será de: " + format.format(custoFinal));
		
	}
}
