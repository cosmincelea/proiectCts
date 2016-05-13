package junitTesting;

public class Student {

	String nume;
	Integer numarTelefon;
	String email;
	Integer note[];
	Double medie;
	StatusStudent status;
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public Integer getNumarTelefon() {
		return numarTelefon;
	}
	public void setNumarTelefon(Integer numarTelefon) {
		this.numarTelefon = numarTelefon;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Student(String nume, Integer numarTelefon, String email,Integer note[]) {
	
		this.nume = nume;
		this.numarTelefon = numarTelefon;
		this.email = email;
		this.note=note;
	}
	
	

	public Student(String nume) {
		super();
		this.nume = nume;
	}
	public Student(String nume, String email) {
		super();
		this.nume = nume;
		this.email = email;
	}
	public Student(String nume, Integer numarTelefon, String email) {
		super();
		this.nume = nume;
		this.numarTelefon = numarTelefon;
		this.email = email;
	}
	public Student(String nume, String email,Integer note[]) {
		super();
		this.nume = nume;
		this.email = email;
		this.note=note;
	}
	public Student(String nume,Integer note[]) {
		this.note=note;
		this.nume = nume;
		
		this.email=null;
		
		
	}
	
	public double medieNote(){
		double sumaNote=0;
		for(int i=0;i<this.note.length;i++)
			sumaNote=sumaNote+note[i];
		this.medie=sumaNote/this.note.length;
		return sumaNote/this.note.length;
	}
	
	public StatusStudent StatusStudent(){
		Integer numarCredite=0;
		double sumaNote=0;
		double medie=0;
		for(int i=0;i<this.note.length;i++){
			if(this.note[i]>5)
			numarCredite=numarCredite+1;
			sumaNote=sumaNote+note[i];
			}
		medie=sumaNote/this.note.length;
		System.out.println("Media este:" +medie);
		if(medie>9.5 && numarCredite==this.note.length){
			return StatusStudent.Bursa;
		}
		if(medie<9.5 && numarCredite==this.note.length && medie>7.5)
			return StatusStudent.Buget;
		if(medie<7.5  && numarCredite>this.note.length-3)	
			return StatusStudent.Taxa;
		else return StatusStudent.Repetent;
		
	}
	public Integer[] getNote() {
		return note;
	}
	public void setNote(Integer[] note) {
		this.note = note;
	}
	public Double getMedie() {
		return medie;
	}
	public void setMedie(Double medie) {
		this.medie = medie;
	}
	public StatusStudent getStatus() {
		return status;
	}
	public void setStatus(StatusStudent status) {
		this.status = status;
	}
	
	
}
