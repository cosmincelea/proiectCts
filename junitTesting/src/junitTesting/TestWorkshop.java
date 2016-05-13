package junitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestWorkshop {

	
EvenimentBuilder builder=new EvenimentBuilder();
	
	Eveniment ev=builder.getEvent("Workshop");
	
	
	
	@Test(timeout=100)
	   public void testConferinta() {
		   
		  String expected1= "Evenimentul este Worksho";
		  System.out.println(expected1);
		  
		  assertNotSame(expected1, ev.descriereEveniment());
	   }	
	
	
	
}
