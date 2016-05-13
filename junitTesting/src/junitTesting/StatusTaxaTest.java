package junitTesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StatusTaxaTest {

	Integer note[]={4,4,10,10,8,8};
	Student stud=new Student("Cosmin Celea",45747457,"cosmincelea@gmail.com",note);
	

		
		

		  
		   @Test(timeout=100)
		   public void testStatus() {
			
				   
			  
				assertEquals(StatusStudent.Taxa, stud.StatusStudent());
		   }
}
