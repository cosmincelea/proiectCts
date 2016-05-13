package junitTesting;

public class Email extends ModalitateAnunta {

	@Override
	public String Anunta(Student s1) {
		if(s1.getEmail()==null){
			String anunt="Nu avem cum sa anuntam studentul";
			System.out.println("Nu avem cum sa anuntam studentul");
			return anunt;
		}
		else {System.out.println(s1.getNume() +" te rugam sa participi la eveniment :Notificare prin Email");
			
		return s1.getNume() +" te rugam sa participi la eveniment :Notificare prin Email";
		}
		
	}

	
	
}
