package junitTesting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class StatusRestantaTest {

	
	Integer note[]={4,4,10,10,8,8,3,3};
	Student stud=new Student("Cosmin Celea",45747457,"cosmincelea@gmail.com",note);
	
	
		
		

		  
		   @Test(timeout=100)
		   public void testStatus() {
			
				   
			 
				assertEquals(StatusStudent.Repetent, stud.StatusStudent());
				assertArrayEquals(note,stud.getNote());
		   }
		   
		   
		   
	
}
