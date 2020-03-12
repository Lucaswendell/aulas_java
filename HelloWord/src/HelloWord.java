import java.util.Scanner;
import utils.Header;

public class HelloWord extends Header{

	public static Scanner leia = new  Scanner(System.in);
	
	public static void main(String[] args) {
		header("HelloWorld and Predecessor");

		System.out.print("Digite um numero: ");
		int numero = leia.nextInt();
		
		System.out.println("O antecessor de " + numero + " é: " + antecessor(numero));
		
	}
	
	public static int antecessor(int numero) {
		return numero - 1;
	}
}
