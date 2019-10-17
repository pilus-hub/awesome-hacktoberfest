import java.util.Scanner;

public class Main{

public static void main(String[] args) {
	
		System.out.println("PROGETTO DI PROGRAMMAZIONE DI PELOSI DANIELE \n");
		 
		Vigenere vigenere = new Vigenere();
		Scanner input = new Scanner(System.in);
		int scelta = 0;
		
		do {
			boolean errore = false;
			
			System.out.println("   MENU DELLE FUNZIONALITA'  \n");
	        System.out.println("\n----Scegli l'azione da svoglere----\n");
	        System.out.println("1) CIFRATURA CON CIFRARIO DI VIGENERE");
	        System.out.println("2) DECIFRATURA CON CIFRARIO DI VIGENERE");
	        
	        try {
	        	scelta = Integer.parseInt(input.nextLine());
	        }
	        catch(Exception e) {
            	System.out.println("Comando non valido");
                errore = true;
	        }
	        
	        if(errore == false) {
	        	try{
	        		switch(scelta) {
	        		
	        		case 1:
	        			
	        			vigenere.Inserimento();
	        			vigenere.Cifratura();
	        			System.out.println("\nPremere invio per tornare al menu");
                        input.nextLine();
	                	break;	
                    
	        		case 2:
	        			
	        			vigenere.Inserimento();
	        			vigenere.Decifratura();
	        			System.out.println("\nPremere invio per tornare al menu");
                        input.nextLine();
                        break;
                      
                        
	        		}
	        		
	        	
	        	}
	        	catch(Exception e) {
                	System.out.println("\nPremere INVIO per tornare al menu");
                    input.nextLine();
	        	}
	        }		
	}
	while(scelta != 0);
	System.out.println("\n\n\n\n\n\n\n ------  PROGRAMMA TERMINATO ------ \n\n\n\n");
	
	input.close();
	}
}
