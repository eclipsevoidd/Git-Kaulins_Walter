package lvt;

import java.util.Random;

public class ProgrammaBama {

	static void MestKaulinu(int reizes) {
		
		
int skaitlis;
Random rand = new Random();

for(int i=1;i<=reizes;i++) {
skaitlis = rand.nextInt(6)+1;

System.out.println("Jusu skaitlis ir: "+skaitlis);
	}


	}
	
	public static void main(String[] args) {
		
MestKaulinu(5);
		
	}

}
