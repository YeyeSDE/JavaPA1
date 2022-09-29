/* 
 * Ye Xu
 * COSI 12b, Fall 2022
 * Programming Assignment #1
 * Problem 4
 */

import java.util.*;

public class problem4 {
	
	public static String rotation (String message, int key) {
		String outcome = new String ();
		
/* By for loop, we can traverse the input and calculate the matching ASCII values of the input. 
 
   Since there are 26 letters in total, we need to find out the remainder of the number deducted by 26 to 
   go back the beginning of the position when reaching the last letter. 
   
   While A is 65 at ASCII table, we need to deduct it first to find out the actual length of the span 
   and then add 65 to find out the matching letter on ASCII table. */
	
		
		for (int i = 0; i < message.length(); i++) {
			if (message.charAt(i) != ' ') {
				char k = Character.toUpperCase(message.charAt(i));
				outcome = outcome + (char)(((int)k + key - 65 ) % 26 + 65);
			} else {
				outcome = outcome +(char)(' ');
			}
		}
		return outcome;
				
	}

	public static void main(String[] args) {
		System.out.print("Your message?");
		Scanner input1 = new Scanner (System.in);
		String message = input1.nextLine();
		System.out.print("Encoding key?");
		Scanner input2 = new Scanner (System.in);
		int key = input2.nextInt();
		
	    System.out.println(rotation(message, key));
		
		// TODO Auto-generated method stub
	    
	    input1.close();
	    input2.close();

	}
	
}
