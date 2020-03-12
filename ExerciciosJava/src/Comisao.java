import java.text.NumberFormat;
import java.util.Scanner;

public class Comisao {
	public static Scanner leia = new Scanner(System.in);
	public static NumberFormat format = NumberFormat.getCurrencyInstance();
	
	public static void main(String[] args) {
		double salarioFixo, salarioFinal, valorDasVendas, comisao = 0, comisaoExtra = 0;
		
		System.out.print("Digite o seu salario: ");
		salarioFixo = leia.nextFloat();
		System.out.print("Digite o valor das vendas: ");
		valorDasVendas = leia.nextFloat();
		
		if(valorDasVendas > 1500) {
			comisao = (1500 * 0.03);
			comisaoExtra = (valorDasVendas - 1500) * 0.05;	
			System.out.println("Sua comisão extra foi: " + format.format(comisaoExtra));
		}else {
			comisao = (valorDasVendas * 0.03);
		}
		salarioFinal = salarioFixo + comisao + comisaoExtra;
		
		System.out.println("Sua comisão foi: " + format.format(comisao));
		System.out.println("Seu salario nesse mês foi de: " + format.format(salarioFinal));
		
	}
}
