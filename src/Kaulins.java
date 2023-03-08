import java.util.Random;
import java.util.Scanner;

public class Kaulins {
	public static void main(String[] args) {
		int skaitlis,reizes;
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Cik reizes metīsi kauliņu?\n");
		reizes = scan.nextInt();
		scan.close();
		
		for(int i=0; i<reizes; i++){
			skaitlis = rand.nextInt(6)+1;
			System.out.println("Uzkrita skaitlis: "+skaitlis);
		}
	
	}
}
