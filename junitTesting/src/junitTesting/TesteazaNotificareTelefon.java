package junitTesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteazaNotificareTelefon {

	
	
	Student stud=new Student("Cosmin Celea",730087473,"cosmincelea@gmail.com");
	Email email=new Email();
	Telefon telefon=new Telefon();
		

		
		

		  
		   @Test(timeout=1)
		   public void testNotificare() {
			   telefon.setSuccesor(email);
			  String expected1=stud.getNume() +" te rugam sa participi la eveniment :Notificare prin Telefon";
				assertEquals(expected1, telefon.Anunta(stud));
		   }

	
	
	
}
