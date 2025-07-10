/*
 Author: Rishita
 Date: 10/07/2025
 Purpose: To check voting eligibility.
*/
package question1;

import java.util.Scanner;

public class VotingEligibility {
	public static void main (String[] args) {
		Scanner scan= new java.util.Scanner(System.in); //scan is a variable name,it can be any.
		System.out.println("Enter your age: ");
		int age=scan.nextInt();
		if(age>17) {
			System.out.println("Eligible to vote!");
		}
		else {
			System.out.println("Not eligible to vote!");
		}
		scan.close();
	}
}