package junitTesting;

public class EvenimentBuilder {

	
	public Eveniment getEvent(String tipEveniment){
		if(tipEveniment.equalsIgnoreCase("Conferinta"))
			return new Conferinta();
		else if (tipEveniment.equalsIgnoreCase("Workshop"))
			return new Workshop();
		else return new Hackthone();
		
		
	}
	
	
}
