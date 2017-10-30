
import java.util.Scanner;

public class Studienberatung {
public static void main (String[] args) { 

Scanner input = new Scanner (System.in) ;
	String abi;
<<<<<<< HEAD
	String fachabi;
	
	boolean loop = true;
	boolean loop2 = false;
=======
	
	String wiss;
	
	boolean loop = true;
	
	boolean loop3 = true;
	
>>>>>>> hast-du-Abitur
	
//Frage 1 
	System.out.println("Hast du Abitur Y N ");											
	while (loop == true) {
	abi = input.next();	
	if (abi.equals("y") || abi.equals("Y") ) {
	abi = "Ja";  
	System.out.println (abi); 
	loop = false;
	
	}
	 else if (abi.equals("N") || abi.equals("n")) {
		abi = "Nein";  
		System.out.println (abi); 
		loop = false;
		
		}
	else { System.out.println("Falsche Eingabe. Bitte Y oder N antworten.");
	loop = true;
	}




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Frage 3
	System.out.println("Bist du Wissbegierig Y N");											
	while (loop3 == true) {
	wiss = input.next();	
	if (wiss.equals("y") || wiss.equals("Y") ) {
	wiss = "Ja";  
	System.out.println (wiss); 
	loop3 = false;
	
	}
	 else if (wiss.equals("N") || wiss.equals("n")) {
		wiss = "Nein";  
		System.out.println (wiss); 
		loop3 = false;
		
		}
	else { System.out.println("Falsche Eingabe. Bitte Y oder N antworten.");
	loop3 = true;
	}
	
	
	
	
	
}
}
