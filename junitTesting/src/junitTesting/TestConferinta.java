package junitTesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestConferinta {
	EvenimentBuilder builder=new EvenimentBuilder();
	
	Eveniment ev=builder.getEvent("Conferinta");
	
	
	
	@Test(timeout=100)
	   public void testConferinta() {
		   
		  String expected1= "Evenimentul este Conferinta";
		  System.out.println(expected1);
		  
			assertEquals(expected1, ev.descriereEveniment());
	   }
	
	
	
}
