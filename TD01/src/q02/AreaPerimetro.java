package q02;

import java.util.Scanner;

public class AreaPerimetro {
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		float base, altura, perimetro, area;
		
		System.out.print("Digite a base do retangulo: ");
		base = leia.nextFloat();
		System.out.print("Digite a altura do retangulo: ");
		altura = leia.nextFloat();
		
		area = base * altura;
		perimetro = (2 * base) + (2 * altura);
		
		System.out.println("Área: " + area);
		System.out.println("Perimetro: " + perimetro);
	}

}
