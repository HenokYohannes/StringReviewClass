package com.syntax1;

public class Doctor {

	// instant variable
	String name;
	String lastName;
	String speciality;
	double salary;

//static variable
	static String hospital;

	//constructors
	
	Doctor(String name,String lastName,String speciality,double salary){
		
		this.name=name;
		this.lastName=lastName;
		this.speciality=speciality;
		this.salary=salary;
	}
	
	
	//constructor
	
	Doctor(String name,String lastName,String speciality){
		
		
		this.name=name;
		this.lastName=lastName;
		this.speciality=speciality;
				
	}
	
	void treatPatient(String name) {
		System.out.println("Doctor "+this.name+" treats patient"+name);
	}
	
	
	
	void printInfo() {
		System.out.println(name + " " + lastName + " is a " + speciality);
	}

	void work() {
		System.out.println(name + " at hospial" + hospital);
	}

	void getPaid() {
		System.out.println(name + "gets paid " + salary);

	}
// static can work only with static

	static void companyName() {
		System.out.println(" All doctors work at" + hospital);

	}

}
