package junitTesting;

public class Telefon extends ModalitateAnunta {

	
	
	@Override
	public String Anunta(Student s1) {
		if(s1.numarTelefon == null){
			return this.succesor.Anunta(s1);
			
		}
		else {System.out.println(s1.getNume() +" te rugam sa participi la eveniment :Notificare prin Telefon");
			return s1.getNume() +" te rugam sa participi la eveniment :Notificare prin Telefon";
		
		}
		
	}

	

}
