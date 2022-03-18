package com.greatlearning.OOPsLabEmailApp.Main;
import com.greatlearning.OOPsLabEmailApp.EmpModel.*;
import com.greatlearning.OOPsLabEmailApp.Service.*;

import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
			
	int choice;
	Scanner sc = new Scanner(System.in);
	Employee employee = new Employee("Prerna","Z","Tech");
	//Employee employee=null;
	
	do {
		System.out.println("Please enter the Department from following\n");
		System.out.println("+1.Technical\n"+"2.Admin\n"+"3.HR\n"+ "4.Legal\n");
		System.out.println("Please Enter bet 1 to 4 to select and Enter 0 to Exit");
						
		choice = sc. nextInt();
						
		switch(choice) {
		 case 0:
			System.out.println("Exit.No more Input"); 
		   return;
				         
		 case 1:
		 employee = new Employee("Prerna", "Z", "Tech");
	      break;
	      
		case 2:
		  employee = new Employee("Prerna", "Z", "Admin");
		  break;
		  
		case 3:
		 employee = new Employee("Prerna", "Z", "HR");
		 break;
		 
		case 4:
		 employee = new Employee("Prerna", "Z", "Legal");
		 break;
					         
		default:
		 System.out.println("Invalid Choice:plz enter bet 1-4 or 0 to exit\n");
		
		}//switch end
		
		
		CredentialService service = new CredentialService();
		
		String emailid= service.generateEmailAddress(employee);
		String password= service.generatePassword();
		service.showCredentials(employee,password,emailid);
		
		} while(choice!=0);
	
		System.out.println("Exited Successfully");
		sc.close();
				
	}//main method end
}//Main class end