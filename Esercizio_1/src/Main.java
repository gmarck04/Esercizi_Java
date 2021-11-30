import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static ArrayList<String> nome = new ArrayList<String>();
	public static ArrayList<Integer> eta = new ArrayList<Integer>();
	
	public static void main(String[] args) {				
		int i = 0; 
		
		do {
				aggiungi();
				i++;
		}while(i < 2);
		
		for(int j = 0; j < nome.size(); j++)
		{
			System.out.println("La persona di nome " + nome.get(j) + " ha " + eta.get(j) + " anni.");
		}
	}

	static void aggiungi()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci il tuo nome");
		nome.add(scanner.nextLine());
		
		System.out.println("Inserisci la tua età");
		eta.add(scanner.nextInt());	
	}
}
