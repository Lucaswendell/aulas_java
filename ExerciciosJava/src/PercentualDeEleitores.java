import java.util.Scanner;

public class PercentualDeEleitores {
	public static Scanner leia = new Scanner(System.in);
	public static void main(String args[]) {
		int totalDeEleitores = 0, votosEmBranco, votosNulos, votosValidos;
		float percentualVotosBrancos, percentualVotosNulos, percentualVotosValidos;
		
		System.out.print("Digite a quatidade de eleitores do seu municipio: ");
		totalDeEleitores = leia.nextInt();
		
		while(totalDeEleitores == 0) {
			System.out.print("Qtd de eleitores não pode ser igual a zero: ");
			totalDeEleitores = leia.nextInt();
		}
		
		
		System.out.print("Agora digite a qtd de votos em branco: ");
		votosEmBranco = leia.nextInt();
		System.out.print("Agora digite a qtd de votos nulos: ");
		votosNulos = leia.nextInt();
		System.out.print("Agora digite a qtd de votos validos: ");
		votosValidos = leia.nextInt();
		
		System.out.println("");
		System.out.println("Calculando ...");
		System.out.println("");
		
		percentualVotosBrancos = (votosEmBranco * 100) / totalDeEleitores;
		percentualVotosNulos = (votosNulos * 100) / totalDeEleitores;
		percentualVotosValidos = (votosValidos * 100) / totalDeEleitores;
		
		System.out.println("Total de eleitores: " + totalDeEleitores);
		System.out.println("Percentual de votos em branco: " + percentualVotosBrancos + "%");
		System.out.println("Percentual de votos nulos: " + percentualVotosNulos + "%");
		System.out.println("Percentual de votos validos: " + percentualVotosValidos + "%");
		
	}
}
