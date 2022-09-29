/*
 * Ye Xu
 * COSI 12b, Fall 2022
 * Programming Assignment #1
 * Problem 5
 * 
 */
import java.util.*;

public class Problem_5 {
	
// create the two strings first and last in method of pigLatin
	
	public static String pigLatin (String name) {
		String fullName = new String ();

// capitalize the first letter of the name  
		
		if (name.length() < 2) {
			fullName = fullName + name.toUpperCase() + "ay ";
		} else {
			
/* we select the first letter of of the input by using substring and select the rest of the name 
   then make the first letter into upper case and add "ay" at the end.  
 */
			fullName = name.substring(1,2).toUpperCase() + 
					name.substring(2).toLowerCase() + name.substring(0,1).toLowerCase() + "ay ";
		}
	
		return fullName;
		
	}
	
// create the scanner for the users to input first name and second name
	
	public static void main(String[] args) {
		System.out.println("Please enter your first name: ");
		Scanner inputFirstName = new Scanner (System.in);
	    String first = inputFirstName.nextLine();
	    
		System.out.println("Please enter your last name: ");
		Scanner inputLastName = new Scanner (System.in);
		String last = inputLastName.nextLine();
		
// use the method of pigLatin to convert	
		
		String fullName = pigLatin (first) + pigLatin(last);
	
		System.out.println("Your name in piglatin is:  " + fullName);
		
		inputFirstName.close();
		inputLastName.close();
	}
}
	
		

		

 

	
