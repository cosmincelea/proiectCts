package junitTesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteazaNotificareEmail {
Student stud=new Student("Cosmin Celea","cosmincelea@gmail.com");
Email email=new Email();
Telefon telefon=new Telefon();
	

	
	

	  
	   @Test
	   public void testNotificare() {
		   
		   telefon.setSuccesor(email);
		  String expected1=stud.getNume() +" te rugam sa participi la eveniment :Notificare prin Email";
			assertEquals(expected1, telefon.Anunta(stud));
	   }

	   


	
	
}
