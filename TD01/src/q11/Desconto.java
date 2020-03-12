package q11;

import java.text.NumberFormat;
import java.util.Scanner;

public class Desconto {

	public static Scanner leia = new Scanner(System.in);
	public static NumberFormat format = NumberFormat.getCurrencyInstance();

	public static void main(String[] args) {
		int quantidade;
		float precoUnitario, total, totalPagar;
		double desconto = 0.0;
		
		//Entradas
		System.out.print("Digite o preço unitario do produto: ");
		precoUnitario = leia.nextFloat();
		
		System.out.print("Digite a quantidade adquirida: ");
		quantidade = leia.nextInt();
		
		//Total sem desconto
		total = precoUnitario * quantidade;
		//Calculo desconto
		if(quantidade <= 5) { //Desconto de 2%
			desconto = 0.02;
		}else if(quantidade <= 10) { //Desconto de 3%
			desconto = 0.03;
		}else { //Desconto de 5%
			desconto = 0.05;
		}
		totalPagar = (float) (total - (total * desconto));  
		
		System.out.println("Total(sem desconto): " + format.format(total));
		System.out.println("Total(com desconto de "+ (desconto * 100) +"%): " + format.format(totalPagar));
		
	}
}
