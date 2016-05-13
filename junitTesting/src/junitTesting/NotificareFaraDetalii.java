package junitTesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NotificareFaraDetalii {

	Student stud=new Student("Cosmin Celea");
	Email email=new Email();
	Telefon telefon=new Telefon();
		

		
		

		  
		   @Test(timeout=100)
		   public void testNotificare() {
			   telefon.setSuccesor(email);
			  String expected1="Nu avem cum sa anuntam studentul";
				assertEquals(expected1, telefon.Anunta(stud));
		   }

}
