package service;

import java.util.Scanner;



public class option {

    public void welcome()
	{
		User user = new User();
		Administartion admin =new Administration();
		System.out.println("*******************************************************************");
		System.out.println("\t\t"+"Welcome to Community Clinic Service"+"\t\t");
		System.out.println("*******************************************************************");
		
		Scanner s = new Scanner(System.in);
		int choice;
		do{
		
		System.out.println("1. clinic Administration ");
		
		System.out.println("2. User");
		System.out.println("3. Quit");
		System.out.print("Enter your choice : ");
		choice = s.nextInt();
		
		switch(choice){
		
		case 1:
			admin.adminChoice();
			break;
			
		case 2:
			user.Access();
			break;
		
		case 3:
			System.out.println("\t\t\t***Thank You***\t\t\t");
			
		default:
			System.out.println("Invalid Input!!  Try again!!\n");
			welcome();
			
		}
		
		}while(choice!=3);
		
	}
	
}
