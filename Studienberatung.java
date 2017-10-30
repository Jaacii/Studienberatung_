
import java.util.Scanner;

public class Studienberatung {
public static void main (String[] args) { 

Scanner input = new Scanner (System.in) ;
	String abi;

	String fachabi;
	
	boolean loop = true;
	boolean loop2 = false;

	
	String wiss;
	
	String beruf;
	boolean loop4 = false;
	
	boolean loop3 = true;
	

	
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




	
	
	
	
		
	//Frage 2
	System.out.println("Bist du Fachabitur Y N");											
	while (loop2 == true) {
	fachabi = input.next();	
	if (fachabi.equals("y") || fachabi.equals("Y") ) {
	fachabi = "Ja";  
	System.out.println (fachabi); 
	loop2 = false;
	loop3 = true;
	}
	 else if (fachabi.equals("N") || fachabi.equals("n")) {
		fachabi = "Nein";  
		System.out.println (fachabi); 
		loop2 = false;
		loop3 = true;
		}
	else { System.out.println("Falsche Eingabe. Bitte Y oder N antworten.");
	loop2 = true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Frage 3
	System.out.println("Bist du Wissbegierig Y N");											
	while (loop3 == true) {
	wiss = input.next();	
	if (wiss.equals("y") || wiss.equals("Y") ) {
	wiss = "Ja";  
	System.out.println (wiss); 
	loop3 = false;
	loop4 = true;
	}
	 else if (wiss.equals("N") || wiss.equals("n")) {
		wiss = "Nein";  
		System.out.println (wiss); 
		loop3 = false;
		loop4 = true;
		}
	else { System.out.println("Falsche Eingabe. Bitte Y oder N antworten.");
	loop3 = true;
	
	}
	
	
	//Frage 4
	System.out.println("Bist du eine Berufsausbildung Y N");											
	while (loop2 == true) {
	beruf = input.next();	
	if (beruf.equals("y") || beruf.equals("Y") ) {
	beruf = "Ja";  
	System.out.println (beruf); 
	loop4 = false;
	
	}
	 else if (beruf.equals("N") || beruf.equals("n")) {
		beruf = "Nein";  
		System.out.println (beruf); 
		loop4 = false;
		
		}
	else { System.out.println("Falsche Eingabe. Bitte Y oder N antworten.");
	loop4 = true;
	}
	
	
	
}
}
