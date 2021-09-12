package regex.com;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC_4CheckVaildMobileNumber 
{
	/*
	 * @purpose:In registration system check mobile number is valid or invalid
	 * @return: No return value
	 * @input: mobile number
	 * @output: Check mobile number is valid or invalid
	 */
	 public static void checkValidMobileNumber(String mobilenumber)
	 {
		 
	  boolean ismobilenumber;
	  String mobilenumberRegex = "^[0-9]{2}\s{1}[0-9]{10}$";
	  Pattern pattern = Pattern.compile(mobilenumberRegex);
	
	  if (mobilenumber == null) 
	 {
		ismobilenumber = false;
	 }
	
	Matcher matcher = pattern.matcher(mobilenumber);
	ismobilenumber = matcher.matches();
	
    if (ismobilenumber)
    	System.out.println(mobilenumber + " mobilenumber is vaild");
	else
		System.out.println(mobilenumber + " mobilenumber is not vaild");
   }
	 
  public static void main(String[] args) 
  {
	Scanner sc= new Scanner(System.in); 
	System.out.println("Enter the mobilenumber name:");
	String mobilenumber= sc.nextLine();
	 checkValidMobileNumber(mobilenumber);
  }
}





