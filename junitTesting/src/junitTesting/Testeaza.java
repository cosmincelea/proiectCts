package junitTesting;

import java.util.ArrayList;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Testeaza {
	
//	Am folosit prima data SimpleFactory pentru a crea diferitele evenimente plecand toate de la interfata eveniment
//	Apoi am folosit Chain of Responsibility pentru a anunta in functie de datele pe care le avem despre Student prin modalitati diferite
//	Iar apoi am folosit Obbserver pentru a anunta toti studenti care sunt abonati la evenimentul respectiv

	public static void main(String[] args) {
//		Email email=new Email();
//		Telefon tel=new Telefon();
//		tel.setSuccesor(email);
//		Student s1=new Student("george",343434,"email@sdada");
//		Student s2=new Student("Aurel","email@sdada");
//		Student s3=new Student("george");
//		EvenimentBuilder builder=new EvenimentBuilder();
//	
//		Eveniment ev=builder.getEvent("sdada");
//		
//		ev.addStudent(s1);
//		ev.addStudent(s2);
//
//		ev.addStudent(s3);
//		ArrayList <Student> stud=new ArrayList();
//		stud=ev.ReturneazaUtilizatori();
//		for(Student studs: stud){
//			tel.Anunta(studs);
//		}
		Integer note[]={5,4,3,10,9,4,7,9,10,10};
		Student s1=new Student("george",343434,"email@sdada",note);
		System.out.println(s1.medieNote());
		 Result result = JUnitCore.runClasses(NotificareSuite.class);
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
	      System.out.println(result.wasSuccessful());
	      
	      
	      Result result2 = JUnitCore.runClasses(StatusSuite.class);
	      for (Failure failure : result2.getFailures()) {
	         System.out.println(failure.toString());
	      }
	      System.out.println(result2.wasSuccessful());
	      
	      
	      Result result3 = JUnitCore.runClasses(TestSingleton.class);
	      for (Failure failure : result3.getFailures()) {
	         System.out.println(failure.toString());
	      }
	      System.out.println(result3.wasSuccessful());
	      
	      Result result4 = JUnitCore.runClasses(EvenimentSuite.class);
	      for (Failure failure : result4.getFailures()) {
	         System.out.println(failure.toString());
	      }
	      System.out.println(result4.wasSuccessful());
	      
	}
	
	
}
