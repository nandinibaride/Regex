package regex.com;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC_3RegistrationSystem
{	
	/*
	 * @purpose:In registration system check email-id is valid or invalid
	 * @return: No return value
	 * @input: email-id
	 * @output: Check email-id is valid or invalid
	 */
	
	 public static void checkValidemail(String email) 
	 {	
			boolean isemail;
			String emailRegex = "^[a-z0-9+_.-]+@[a-z0-9.-]+$";
			Pattern pattern = Pattern.compile(emailRegex);
			
			if (email == null) 
			{
				isemail = false;
			}
			
			Matcher matcher = pattern.matcher(email);
			isemail = matcher.matches();
			
            if (isemail)
	        	System.out.println(email + " email id is vaild");
			else
				System.out.println(email + " email id is not vaild");
	 }
		  public static void main(String[] args) 
		  {
			  
			Scanner sc= new Scanner(System.in); 
			System.out.println("Enter the email-id name:");
			String email= sc.nextLine();
			 checkValidemail(email);
		  }
}
	


