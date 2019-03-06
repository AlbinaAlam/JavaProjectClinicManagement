package service;

import java.util.Scanner;

import clinic.dao.PatientDao;
import clinic.entities.Patient;



public class User {
	Patient p;
	 private Patient patient=new Patient();
	 private String name= new String();
	 private String bg= new String();
	 private int age;
	 private int did;
	 private int address;
	 private PatientDao patientDao= new PatientDao();
	 private Scanner scan=new Scanner(System.in);
	 public void Access()throws Exception
	 {
		 System.out.println("\n"+"WHAT YOU WANT TO DO?"+"\n");
         System.out.println("1.MAKE AN APPOINTMENT"+"\n"+"2.VISIT YOUR PROFILE"+"\n");
         System.out.println("Enter your choice: (1\2)"+"\n");
         int c;
         c = scan.nextInt();
 		
 		switch(c){
 		
 		case 1:
 		addPatient();
 			break;
 			
 		case 2:
 			visitProfile();
 			break;
 			
 		
 		default: 
 			System.out.println("Invalid Input!!  Try again!!\n");
 		}while(c!=2);
 		
 		
}
	 


public void addPatient() throws Exception
{
	
	System.out.println("\tEnter Data for  Patient:");              
    System.out.print("\tEnter Name:");
	 name=scan.next();
	  
	 System.out.print("\tAge:");
	 age=scan.nextInt();
	 System.out.print("\tAddress:");
	 address=scan.nextInt();
	 System.out.print("\tDoctors ID:");
	 did=scan.nextInt();
	System.out.print("\tBlood Group");
bg=scan.next();

	 patient= new Patient(name,bg,age,address,did);
	 patientDao.Insertion(patient);
	 
}

public void visitProfile() throws Exception
{
	System.out.print("\tEnter your ID:");
	int id=scan.nextInt();
	patientDao.selectionId(id);
}

public void patientDetail() throws Exception
{
	System.out.println("/n***********************************************************************");
	//System.out.println("There are "+n1+" bags available");

	    //System.out.println("Bags:"+i+1);;
	    patientDao.showAllRecords();
	    
	    System.out.println("\n");

	 System.out.println("***********************************************************************");
}


 
}
