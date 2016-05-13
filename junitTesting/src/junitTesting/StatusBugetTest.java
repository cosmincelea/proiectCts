package junitTesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StatusBugetTest {
	Integer note[]={9,10,10,9,10,10,9,10};
	Student stud=new Student("Cosmin Celea",45747457,"cosmincelea@gmail.com",note);
	

		
		

		  
		   @Test(timeout=100)
		   public void testStatus() {
			
				   
			  
				assertEquals(StatusStudent.Bursa, stud.StatusStudent());
		   }
}
