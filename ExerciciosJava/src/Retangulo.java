
public class Retangulo {
	public static void main(String[] args) {
		int qtdColunas = 60, qtdLinha = 10;
		for (int i = 1, j = 1; i <= qtdColunas && j <= qtdLinha; i++, j++) { 
			if(j == 1 || j == qtdLinha) {
				System.out.println("+" .repeat(qtdColunas));
			}else {
				System.out.println("+" + " ".repeat(qtdColunas - 2) + "+");
			}
		}
	
	}
}
