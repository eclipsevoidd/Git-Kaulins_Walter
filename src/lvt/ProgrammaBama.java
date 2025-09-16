package lvt;

import java.util.Random;
import java.util.Scanner;

public class ProgrammaBama { // Programma Obama

	static void MestKaulinu(int reizes) {	

		int skaitlis;
		Scanner scan = new Scanner(System.in);
		System.out.println("Cik reizes mest kaulinu?");
		reizes=scan.nextInt();

		for(int i=1; i<=reizes; i++){
			Random rand = new Random();
			skaitlis = rand.nextInt(6)+1;
			System.out.println("Jusu skaitlis ir: "+skaitlis);	
		}

		scan.close();
	}
	
	public static void main(String[] args) {
		System.out.println("Esiet sveicināts! "); // ts pmo brah, esat nav pareiza forma! izlabots - Gustavo
		MestKaulinu(500);
	}
}
