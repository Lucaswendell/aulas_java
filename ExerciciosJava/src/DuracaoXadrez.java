import java.util.Scanner;

public class DuracaoXadrez {
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int horaInicial, horaFinal, duracaoJogo = 0;
		
		System.out.print("Digite a hora de inicio do jogo: ");
		horaInicial = leia.nextInt();
		System.out.print("Agora digite a hora final do jogo: ");
		horaFinal = leia.nextInt();
		
		//Dia seguinte
		if(horaInicial >= horaFinal) {
			duracaoJogo = (24 - horaInicial) + horaFinal;
		}else{ //mesmo dia
			duracaoJogo = horaFinal - horaInicial;
		}
		
		System.out.println("A duração do jogo foi de: " + duracaoJogo + "h");
		
	}
}
