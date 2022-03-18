package com.greatlearning.OOPsLabEmailApp.Service;
import com.greatlearning.OOPsLabEmailApp.Main.*;
import com.greatlearning.OOPsLabEmailApp.EmpModel.*;
import java.util.Random;

public class CredentialService {
 
 public String generatePassword()
   {
	String passwordchars="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrsuvwxyz0123456789!@#$%^&*";
	char[] array=new char[8];
	
	Random  random=new Random();
	
	for(int i=0; i<array.length;i++)
	{
	array[i]=passwordchars.charAt(random.nextInt(passwordchars.length()));
	}
	return new String(array);
   }//end generatePassword method

	
 public String generateEmailAddress(Employee emp)
	{
	
	 return emp.getFirstName()+emp.getLastName()+"@"+emp.getDept()+".gl.in";
	
	}//end generateEmailAddress method
	
   public void showCredentials(Employee emp, String password ,String emailid)
   {
	System.out.println("Dear "+emp.getFirstName()+" "+emp.getLastName()+"your generated credentials are as follows");
	 System.out.println("Email-->"+emailid);
	 System.out.println("Password-->"+password);
	}//end showCredentials Method
   
 }//end class Credential Service

