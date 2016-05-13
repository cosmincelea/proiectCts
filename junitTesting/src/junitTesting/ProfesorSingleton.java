package junitTesting;

public class ProfesorSingleton {
public static ProfesorSingleton instanta=new ProfesorSingleton();

String name;

public static ProfesorSingleton getInstanta(){
	if(instanta==null)
		return new ProfesorSingleton();
	else return instanta;
}
	public void setNume(String nume){
		this.name=nume;
	}
	
	public ProfesorSingleton(){};
}
