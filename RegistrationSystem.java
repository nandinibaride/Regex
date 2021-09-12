	package regex.com;
	
	import java.util.Scanner;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;
	
	public class RegistrationSystem {
		/*
		 * @purpose:In registration system check first name is valid or invalid
		 * @return: No return value
		 * @input: First name
		 * @output: Check first name is valid or invalid
		 */
		
	   public static void checkValidFirstName(String firstName) {
			
			boolean isFirstName;
			String firstNameRegex = "^[A-Z]{1}[a-z]{3,}$";
			Pattern pattern = Pattern.compile(firstNameRegex);
			
			if (firstName == null) {
				isFirstName = false;
			}
			
			Matcher matcher = pattern.matcher(firstName);
			isFirstName = matcher.matches();
			
	
	        if (isFirstName)
				System.out.println(firstName + " is an valid First Name");
			else
				System.out.println(firstName + " is an Invalid First Name");
		
			}
		
		 public static void main(String[] args) {
			
			Scanner sc= new Scanner(System.in); 
			System.out.println("Enter the first name:");
			 String firstName= sc.nextLine();
			 
		     checkValidFirstName(firstName);
		}
	
	}
	

