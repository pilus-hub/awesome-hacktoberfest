import java.util.ArrayList;
import java.util.Scanner;


public class Vigenere {
	
		public int n;
		public ArrayList<Character> lista = new ArrayList<Character>() ;
		public ArrayList<Character> cifra = new ArrayList<Character>() ;
		public String temporary;
		public String chiave;
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
		public void Inserimento() {
				lista.clear();
				try {
					System.out.println("INSERISCI STRINGA \n");
					temporary = input.nextLine();
					System.out.println("INSERISCI CHIAVE \n");
					chiave = input2.nextLine();
				}catch(Exception e) {
					System.out.println("Comando non valido");
				}	
				for(int x =0;x<temporary.length();x++) {
					lista.add(temporary.charAt(x));
					cifra.add(chiave.charAt(x%chiave.length()));
				}
			}
		
		public void Cifratura() {
			for(int x=0;x < temporary.length();x++) {
				System.out.print((char)(((lista.get(x)-'a')+(cifra.get(x)-'a')+26)%26+'a'));
			}
		}
		
		public void Decifratura() {
			for(int t=0;t < temporary.length(); t++) {
				System.out.print((char)(((lista.get(t)-'a')-(cifra.get(t)-'a')+26)%26+'a'));
			}
		}
	}