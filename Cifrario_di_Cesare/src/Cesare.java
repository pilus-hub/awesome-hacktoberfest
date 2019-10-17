import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Cesare {
	public int n;
	public ArrayList<Character> lista = new ArrayList<Character>() ;
	public String temporary;
	Scanner input = new Scanner(System.in);
	
	public void Inserimento() {
			lista.clear();
			try {
				System.out.println("INSERISCI STRINGA \n");
				temporary = input.nextLine();
			}catch(Exception e) {
				System.out.println("Comand non valido");
			}	
			for(int x =0;x<temporary.length();x++) {
				lista.add(temporary.charAt(x));
			}
		}
	
	public void Cifratura() {
		for(int x=0;x < temporary.length();x++) {
			//lista.set(x, (char) ((lista.get(x)-'a'+3)%26+'a'));
			System.out.print((char) ((lista.get(x)-'a'+3)%26+'a'));
		}
		/*System.out.println("LA FRASE CIFRATA E': ");
		for(int y=0;y< temporary.length();y++) {
			System.out.print(lista.get(y));
		}	*/
	}
	
	public void Decifratura() {
		for(int a=0;a < temporary.length();a++) {
			//lista.set(a, (char)((lista.get(a)-'a'+26-3)%26+'a'));
			System.out.print((char)((lista.get(a)-'a'+26-3)%26+'a'));
		}
		/*System.out.println("LA FRASE DECIFRATA E': ");
		for(int y=0;y< temporary.length();y++) {
			System.out.print(lista.get(y));
		}*/
		
	}
	
	
	}
	
