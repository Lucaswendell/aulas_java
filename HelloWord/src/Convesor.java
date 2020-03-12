import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;

import utils.Header;

public class Convesor extends Header {
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			ArrayList<String> menu = new ArrayList<String>();
			menu.add("Byte para b - KB - MB - GB - TB");
			menu.add("bit para B - KB - MB - GB - TB");

			header("Convensão numerica");
			int opc = menu(menu);

			converter(opc);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void converter(int opc) {
		DecimalFormat format = new DecimalFormat("0.##########");
		int valor = 0;
		switch (opc) {
		case 0:

			System.out.print("Digite o valor em Byte: ");
			valor = leia.nextInt();
			System.out.println(valor + "B = " + (valor * 8) + "b");
			System.out.println(valor + "B = " + format.format((valor / Math.pow(2, 10))) + "KB");
			System.out.println(valor + "B = " + format.format((valor / Math.pow(2, 20))) + "MB");
			System.out.println(valor + "B = " + format.format((valor / Math.pow(2, 30))) + "GB");
			System.out.println(valor + "B = "
					+ (valor >= 400 ? format.format((valor / Math.pow(2, 40))) : (valor / Math.pow(2, 40))) + "TB");
			break;
		case 1:

			System.out.print("Digite o valor em Byte: ");
			valor = leia.nextInt();
			int valorByte = valor / 8;
			System.out.println(valor + "b = " + valorByte + "B");
			System.out.println(valor + "b = " + (valorByte / Math.pow(2, 10)) + "KB");
			System.out.println(valor + "b = " + (valorByte / Math.pow(2, 20)) + "MB");
			System.out.println(valor + "b = " + (valorByte / Math.pow(2, 30)) + "GB");
			System.out.println(valor + "b = " + (valorByte / Math.pow(2, 40)) + "TB");
			break;
		}
	}

}
