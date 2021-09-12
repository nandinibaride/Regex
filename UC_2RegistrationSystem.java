package regex.com;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC_2RegistrationSystem {
	/*
	 * @purpose:In registration system check last name is valid or invalid
	 * @return: No return value
	 * @input: last name
	 * @output: Check last name is valid or invalid
	 */

	 public static void checkValidLastName(String lastName) {
			
			boolean islastName;
			String lastnameRegex = "^[A-Z]{1}[a-z]{3,}$";
			Pattern pattern = Pattern.compile(lastnameRegex);
			
			if (lastName == null) {
				islastName = false;
			}
			
			Matcher matcher = pattern.matcher(lastName);
			islastName = matcher.matches();
			
	        if (islastName)
				System.out.println(lastName + " is an valid last name");
			else
				System.out.println(lastName + " is an invalid last name");
		
			}
		
		 public static void main(String[] args) {
			
			Scanner sc= new Scanner(System.in); 
			System.out.println("Enter the last name:");
			 String lastName= sc.nextLine();
			 
		     checkValidLastName(lastName);
		     }
   }
	

