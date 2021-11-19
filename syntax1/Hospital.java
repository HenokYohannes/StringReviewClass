package com.syntax1;

public class Hospital {

	public static void main(String[] args) {
		
		
		Doctor.hospital=" Inova";
	Doctor doctor1=new Doctor("John","Smith","Dentist",20000);
	//doctor1.name="John";
	doctor1.printInfo();
	doctor1.work();
	
	
	Doctor doctor2=new Doctor("Jane","Doe","Cardiologyst");
		
	/*doctor2.name="Jane";
	 *doctor2.lastName="Smith";
	   doctor2.name="Cardiologyst";
	 */
	
	doctor2.work();
	doctor2.lastName="Bond";
	
	// change will affect all instance
	//doctor2.hospital=" JW Hospital";
	
	System.out.println();
	
	doctor2.work();
	doctor1.work();
	
	System.out.println(doctor1.lastName);
	System.out.println(doctor2.lastName);
	
	//accessing static method
	Doctor.companyName();
	
	doctor1.treatPatient(" James");
	doctor2.treatPatient(" Anna");
	
	
	}

}
