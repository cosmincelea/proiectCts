package junitTesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestHackthone {
EvenimentBuilder builder=new EvenimentBuilder();
	
	Eveniment ev=builder.getEvent("Hackthone");
	
	
	
	@Test(timeout=100)
	   public void testConferinta() {
		   
		  String expected1= "Evenimentul este Hackthone";
		  System.out.println(expected1);
		  
			assertEquals(expected1, ev.descriereEveniment());
	   }
	
}
