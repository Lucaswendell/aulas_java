package lp20200305;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import static utils.Utils.*;

public class Maca {
	public static Scanner leia = new Scanner(System.in);
	public static NumberFormat format = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

	public static void main(String[] args) {
		header(" Ma��s ");
		
		final double  MACA_DUZIA = 1,
					  MACA_NORMAL = 1.30;
			  double total,
				     qtdMaca;
		
		System.out.print("Digite a qtd de ma�as compradas: ");
		qtdMaca = leia.nextDouble();
	
		if(qtdMaca < 12) {
			total = qtdMaca * MACA_NORMAL;
		}else {
			total = qtdMaca * MACA_DUZIA;
		}
		
		System.out.println("Valor a ser pago: " + format.format(total));
		
		
	}
}
