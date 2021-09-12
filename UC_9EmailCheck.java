package regex.com;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC_9EmailCheck
{	
	/*
	 * @purpose:In registration system compare email-id is valid or invalid
	 * @return: No return value
	 */
	
	 public static void checkValidemail(String email) 
	 {	
			boolean isemail;
			String emailRegex = "^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
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
			  System.out.println("*****Valid Emails*****");
				
				String email = "abc@bridgelabz.co.in";
				checkValidemail(email);
				
				email = "abc@gmail.com.com";
				checkValidemail(email);
				
				email = "abc@yahoo.com";
				checkValidemail(email);
				
				email = "abc@1.com";
				checkValidemail(email);
				
				email = "abc-100@yahoo.com";
				checkValidemail(email);
				
				email = "abc.100@yahoo.com";
				checkValidemail(email);
				
				email = "abc111@abc.com";
				checkValidemail(email);
				
				email = "abc-100@abc.net";
				checkValidemail(email);
				
				email = "abc.100@abc.com.au";
				checkValidemail(email);
				
				email = "abc+100@gmail.com";
				checkValidemail(email);
				
			System.out.println("*****Invalid Emails******");
				
				email = ".abc@abc.com";
				checkValidemail(email);
				
				email = "abc";
				checkValidemail(email);

				email = "abc@.com.my";
				checkValidemail(email);

				email = "abc@abc@gmail.com";
				checkValidemail(email);
				
				email = "abc()*@gmail.com";
				checkValidemail(email);

				email = "abc..2002@gmail.com";
				checkValidemail(email);

				email = "abc.@gmail.com";
				checkValidemail(email);

				email = "abc123@.com";
				checkValidemail(email);

				email = "abc123@.com.com";
				checkValidemail(email);

				email = "abc123@gmail.a";
				checkValidemail(email);

				email = "abc@%*.com";
				checkValidemail(email);

				email = "abc@gmail.com.1a";
				checkValidemail(email);

				email = "abc@gmail.com.aa.au";
				checkValidemail(email);
         }
		 
}
	


