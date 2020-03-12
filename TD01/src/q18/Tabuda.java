package q18;

public class Tabuda {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			for(int j=0; j <= 10; j++) {
				System.out.println( i + " X " + j + " = " + (j * i));
			}
			System.out.println("");
		}
	}
}
