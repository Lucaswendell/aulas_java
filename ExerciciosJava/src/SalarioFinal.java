import java.text.NumberFormat;
import java.util.Scanner;

public class SalarioFinal {
	public static Scanner leia = new Scanner(System.in);
	public static NumberFormat format = NumberFormat.getCurrencyInstance();
	
	public static void main(String[] args) {
		int qtdCarroVendido;		
		float valorTotalVendas, salarioFixo, valorPorCarroVendido, salarioFinal;
		
		System.out.print("Digite a qtd de carros vendidos: ");
		qtdCarroVendido = leia.nextInt();
		System.out.print("Agora digite o valor total de suas vendas: ");
		valorTotalVendas = leia.nextFloat();
		System.out.print("Agora digite seu sálario fixo: ");
		salarioFixo = leia.nextFloat();
		System.out.print("Agora digite o valor você recebe por cada carro vendido: ");
		valorPorCarroVendido = leia.nextFloat();
		
		salarioFinal = (float) (( qtdCarroVendido * valorPorCarroVendido ) + (valorTotalVendas * 0.05) + salarioFixo);
		
		System.out.println("Seu sálarios esse mês será de: " + format.format(salarioFinal));
	}

}
