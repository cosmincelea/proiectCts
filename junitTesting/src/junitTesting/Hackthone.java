package junitTesting;

import java.util.ArrayList;

public class Hackthone implements Eveniment{

	public ArrayList<Student> studenti=new ArrayList();
	

	public ArrayList<Student> ReturneazaUtilizatori() {
		return studenti;
	}
	

	public void addStudent(Student s1){
		studenti.add(s1);
		
	}


	@Override
	public String descriereEveniment() {
		
		return "Evenimentul este Hackthone";
	}
	
	
	
}
