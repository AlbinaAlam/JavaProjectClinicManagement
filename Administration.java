package service;

import java.util.Scanner;
import clinic.dao.DoctorDao;

import clinic.dao.PatientDao;


public class Administration  {
	
	private Scanner scan=new Scanner(System.in);
	int docpass=123;
	User user=new User();
	PatientDao patientDao=new PatientDao();
	DoctorDao doctorDao=new DoctorDao();
	public void adminChoice() throws Exception
	{
		//Patient p=new Patient();
		//User user1=new User();
		
		
		System.out.println("1.Receptionst"+"\n"+"2.doctor"+"\n"+"3.admin"+"\n");
	    System.out.println("Enter your choice: (1\2\3)"+"\n");
	    int c;
	    c = scan.nextInt();
switch(c){
 		
 		case 1:
 		receptionist();
 			break;
 			
 		case 2:
 			System.out.print("Please enter password :");
 			int dp=scan.nextInt();
 			if(docpass==dp)
 			{
 				docDetail();
 			}
 			
 			break;
 			
 		
 		default: 
 			System.out.println("Invalid Input!!  Try again!!\n");
 		}while(c!=2);
 		
	}
	public void receptionist() throws Exception 
	{
		System.out.println("1.add patient"+"\n"+"2.show detail of patient"+"\n"+"3.search patient by name"+"\n");
	    System.out.println("Enter your choice: (1\2\3)"+"\n");
	    int c;
	    c = scan.nextInt();
switch(c){
 		
 		case 1:
 		    user.addPatient();
 			break;
 			
 		case 2:
	        user.patientDetail();
 			break;
 			
 		case 3:
 			System.out.print("\tEnter your desired name:");
 			String name=scan.next();
 			searchByName(name);
 		 			break;
 			
 		
 		default: 
 			System.out.println("Invalid Input!!  Try again!!\n");
 		}while(c!=2);
	    
	}
	
	
	
public void searchByName(String s) throws Exception
{

	patientDao.selectionName(s);
}

public void docDetail() throws Exception
{
	System.out.println("/n***********************************************************************");
	
	    doctorDao.showAllRecords();
	    
	    System.out.println("\n");

	 System.out.println("***********************************************************************");
}
	
	
}
