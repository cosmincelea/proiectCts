package junitTesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StatusBursaTest {
	Integer note[]={9,7,8,8,7,9};
	Student stud=new Student("Cosmin Celea",45747457,"cosmincelea@gmail.com",note);
	

		
		

		  
		   @Test(timeout=100)
		   public void testStatus() {
			
				   
			  
				assertEquals(StatusStudent.Buget, stud.StatusStudent());
		   }
}
