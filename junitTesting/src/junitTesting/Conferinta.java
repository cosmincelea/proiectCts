package junitTesting;

import java.util.ArrayList;

public class Conferinta implements Eveniment{

public ArrayList<Student> studenti=new ArrayList();

	@Override
	public ArrayList<Student> ReturneazaUtilizatori() {
		return studenti;
	}

	public void addStudent(Student s1){
		studenti.add(s1);
		
	}

	@Override
	public String descriereEveniment() {
		
		return "Evenimentul este Conferinta";
	}
}
