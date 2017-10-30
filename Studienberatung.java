
import java.util.Scanner;

public class Studienberatung {
public static void main (String[] args) { 

Scanner input = new Scanner (System.in) ;
	String abi;
	String fachabi;
	
	boolean loop = true;
	boolean loop2 = false;
	
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




}
}
