import java.awt.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Kaulins {
	
	static int mestKaulinu(int reizes){
		int skaitlis = 0, lielakais=0;
		Random rand = new Random();
		for(int i=0; i<reizes; i++){
		skaitlis = rand.nextInt(6)+1;
		System.out.println("Uzkrita skaitlis: "+skaitlis);
		if(lielakais<skaitlis){
			lielakais = skaitlis;
		}
		}
		System.out.println("Lielakais skaitlis metienu piegājienā ir "+lielakais);
		return skaitlis;
	} 
	
	public static void main(String[] args) {
		int reizes = 0, izvele, pedejais = 0;
		ArrayList<Integer> pedejie = new ArrayList<Integer>();
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
	for(int i=0; i<pedejie.size(); i++){
	pedejie.get(i);
	}
			break;
		case 3:
			int lielakais=0;
			for(int i=0; i<pedejie.size(); i++){
				lielakais = pedejie.get(i);
			}
			break;
		case 4:
			System.out.println("Programm apturēta!");
			break;
		}
		}while(izvele!=2);
		scan.close();
	}
}
