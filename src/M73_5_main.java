import java.util.Scanner;

public class M73_5_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String frase = "";
			
			
			Scanner entrada = new Scanner(System.in);
			System.out.println("Introdueix una frase: ");
			frase = entrada.nextLine();
			
			String fraseLow = frase.toLowerCase();
			String fraseUpper = frase.toUpperCase();
			
			if(frase.equals(fraseLow)) {
				System.out.println("La frase introduida es integrament en minúscules");
			}else if(frase.equals(fraseUpper)) {
				System.out.println("La frase introduida es integrament en majúscules");
			}else {
				System.out.println("La frase introduïda es en majúscules y  minúsucules");
			}
			
		}
	}


