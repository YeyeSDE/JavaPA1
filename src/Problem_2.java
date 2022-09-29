/*
 * Ye Xu
 * COSI 12b, Fall 2022
 * Programming Assignment #1
 * Problem 2
 */

import java.util.*;

public class Problem_2 {

	// start a method of logNum to get the log number of the input number, on base of 10
	public static int logNum (int num) {
		int count = 0;
		while (num > 0) {
			num /= 10;
			count ++;
		}
		return count;
	}
	
	// create a method to calculate power and multiple it with 10 and return the result
	public static int power (int n) {
		int result = 1;
		for (int power = n; power > 0; power--) {
			result *= 10;
		}
		return result;
	}
	
	// create a method to calculate the number p when giving power of logNum minus 1 to 10 
	public static void display (int num) {
		int k = logNum(num);
		while (k > 0) {
			int p = num / power (k-1);
			System.out.println (p);
			
	// deduct the number p from the input number until getting to the digit at one's place
			num = num - p * power(k-1);
			k--;		
		}
	}
	
	// create a scanner method for the users to input the number, validate the number and apply it to the method of display to display each digit. 
	
	public static void main(String[] args) {
		System.out.println("Please enter a positive integer: ");
		Scanner inputNum = new Scanner(System.in);
	// print out the input
		int num = inputNum.nextInt();
	// validate the input and print out the result
		if ( num < 1) {
			System.out.println("Error");
		} else display (num);
		inputNum.close();
	}
}



	
