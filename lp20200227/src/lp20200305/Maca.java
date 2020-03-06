package lp20200305;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import static utils.Utils.*;
import java.util.ArrayList;

public class Maca {
	public static Scanner leia = new Scanner(System.in);
	public static NumberFormat format = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

	public static void main(String[] args) {
		header(" Maçãs ");
		
		final double  MACA_DUZIA = 1,
					  MACA_NORMAL = 1.30;
			  double total = 0,
				     qtdMaca,
				     opc;
			  ArrayList<String> itens = new ArrayList<String>();
			  itens.add("Maçã");
			  itens.add("Uva");
			  
		opc = menu(itens);
		 
		System.out.print("Digite a qtd: ");
		qtdMaca = leia.nextDouble();
		
		switch ((int)opc) {
			case 1:
				total = qtdMaca * 1.60;
				break;
			case 2:
				total = qtdMaca * 5.50;
				break;
			default:
			break;
		}
		/*if(qtdMaca < 12) {
			total = qtdMaca * MACA_NORMAL;
		}else {
			total = qtdMaca * MACA_DUZIA;
		}*/
		
		
		System.out.println("Valor a ser pago: " + format.format(total));
		
		
	}
}
