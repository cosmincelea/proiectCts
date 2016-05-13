package junitTesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSingleton {

	

ProfesorSingleton prof1=ProfesorSingleton.getInstanta();
ProfesorSingleton prof2=ProfesorSingleton.getInstanta();
	
	
	
	@Test(timeout=100)
	   public void testConferinta() {
		   
		prof2.setNume("Gogu");
		  
			assertEquals(prof1, prof2);
	   }
	
	
	
}
