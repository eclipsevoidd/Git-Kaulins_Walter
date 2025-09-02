package lvt;

import java.util.Random;
import java.util.Scanner;

public class ProgrammaBama {

	public static void main(String[] args) {
		
int skaitlis, reizes;
Scanner scan = new Scanner(System.in);
System.out.println("Cik reizes mest kaulinu?");
reizes=scan.nextInt();

for(int i=1; i<=reizes; i++){
Random rand = new Random();

skaitlis = rand.nextInt(6)+1;

System.out.println("Jusu skaitlis ir: "+skaitlis);
}		
		
		

	}

}
