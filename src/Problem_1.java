/*
 * Ye Xu
 * COSI 12b, Fall 2022
 * Programming Assignment #1
 * Problem 1
 */
import java.util.Scanner;

public class Problem_1 {

	public static void main(String[] args) {	
		// create a scanner function to input the integers
		Scanner inputNum = new Scanner(System.in);
		System.out.println("Please enter a positive integer:  ");
		int num = inputNum.nextInt();
		
		// validate the input 
		 if (num < 1){
			System.out.println("Error");
		 } else {
		 
			 // print the input	
			 System.out.println("Initial value is " + num);		
		
			 // give the computing orders and print the output
		
			 int count = 0;
			 while (num != 1) {
				 if (num % 2 == 0) {
					 num = num / 2;			
				 } else {
					 num = num * 3 + 1;
				 }
				 count++;
				 if (num != 1) {
					 System.out.println("Next value is " + num);
				 }
			 }	
			System.out.printf("Final value " + num + ", number of operations performed " + count);
		
			inputNum.close();
	 	}
	}
}

 




