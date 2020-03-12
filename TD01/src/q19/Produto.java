package q19;

import java.util.Scanner;

public class Produto {
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		final float qtdProdutos = 15;
		float maiorLido = 0, preco, media, soma = 0;
		String codigo, codigoMaior = "";
		
		int i = 0;
		while(i < qtdProdutos) {
			System.out.print("Digite o codigo do " + (i + 1) + "° produto: ");
			codigo = leia.next();
			
			System.out.print("Agora digite o preço do produto: ");
			preco = leia.nextFloat();
			
			soma += preco;
			
			if(preco > maiorLido) {
				maiorLido = preco;
				codigoMaior = codigo;
			}
			
			i++;
		}
		
		//Media
		media = soma / qtdProdutos;
		
		System.out.println("Média de preços: " + media);
		System.out.println("Maior preço lido: " + maiorLido + " [codigo - "+ codigoMaior +"]");
	}

}
