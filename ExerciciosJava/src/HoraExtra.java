import java.text.NumberFormat;
import java.util.Scanner;

public class HoraExtra {
	public static Scanner leia = new Scanner(System.in);
	public static NumberFormat format = NumberFormat.getCurrencyInstance();

	public static void main(String[] args) {
		int horasTrabalhadas;
		double salarioPorHora, salarioFinal, extra = 0;
		
		System.out.print("Digite o valor da sua hora: ");
		salarioPorHora = leia.nextFloat();
		System.out.print("Digite a qtd de horas trabalhadas nesse mês: ");
		horasTrabalhadas = leia.nextInt();
		
		if(horasTrabalhadas > 160) {
			extra = (horasTrabalhadas - 160) * (salarioPorHora + (salarioPorHora * 0.5));
			System.out.println("Sua extra foi de: " + format.format(extra));
		}
		
		salarioFinal = (salarioPorHora * horasTrabalhadas) + extra;
		
		System.out.println("Seu salario nesse mês é de: " + format.format(salarioFinal));
	}
}
