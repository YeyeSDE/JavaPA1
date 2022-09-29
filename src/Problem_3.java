
import java.util.*;
/*
 * Ye Xu
 * COSI 12b, Fall 2022
 * Programming Assignment #1
 * Problem 3
 * 
 */

public class Problem_3 {
	
 // create an integer array and string array which have corresponding/matching values
	
   public static String romanDisplay (int num){
		int[]values = { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000, 4000, 5000};
		String[]romanNumerals = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M", "MMMM", "" };

// use StringBuilder to save the numbers 
		
		StringBuilder output = new StringBuilder();
		
	
// create a while loop to traverse the numbers with finding the correct intervals where the input number value is between the index value and value of index plus one. Then select the matching Roman numerals. Print it out.
		
		while (num > 0) {
			int i = values.length-1;
			for (i = values.length-1; i >= 0; i--) {
				if (num < values [i] && num >= values[i-1]) {
					output.append (romanNumerals [i-1]);
					num -= values [i-1];
					break;
				}
			}
			
		}	
		
		return output.toString();
	 }	 

 // validate the input and display the matching Roman numerals by using the method of romanDisplay
	public static void main (String[] args) {
		System.out.println("Please enter a number: ");
		Scanner inputNumber = new Scanner (System.in);
		int num = inputNumber.nextInt();
		// validate the input and print out the result
		if ( num > 4999) {
		System.out.println("Error");
		} else {
			System.out.println(romanDisplay(num));
		}
		inputNumber.close();
	 }
   }

