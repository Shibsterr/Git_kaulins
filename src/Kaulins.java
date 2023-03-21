import java.util.Random;
import java.util.Scanner;
public class Kaulins {
	
	static int mestKaulinu(int reizes){
		int skaitlis = 0;
		Random rand = new Random();
		for(int i=0; i<reizes; i++){
		skaitlis = rand.nextInt(6)+1;
		System.out.println("Uzkrita skaitlis: "+skaitlis);
		}
		return skaitlis;
	}
	
	public static void main(String[] args) {
		int reizes = 0, izvele, pedejais = 0;
		Scanner scan = new Scanner(System.in);
		do{
		System.out.print("1-Mest kauliņu | 2-Apskatit pēdejo | 3-Apturēt ");
		izvele = scan.nextInt();
		switch(izvele){
		case 1:
			do{
				System.out.println("Cik reizes velies mest kauliņu?");
				reizes = scan.nextInt();
		}while(reizes<1);
		pedejais =	mestKaulinu(reizes);
			break;
		case 2:
			System.out.println("Pedejais uzmetais ir "+pedejais);
			break;
		case 3:
			System.out.println("Programma apturēta!");
			break;
		}
		
		}while(izvele!=3);
		scan.close();
	}
}
