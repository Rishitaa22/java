/* 
 Author: Rishita
 Date: 11-07-2025
 Purpose: Java Program to print grade.
*/
package javafiles;

public class Grade {
	public static void main(String[] args) {
		String grade= "p";
		
		String result = switch (grade) {
			case "O" -> "Outstanding Performance";
			case "A" -> "Excellent Performance";
			case "B" -> "Very Good Perforance";
			case "C" -> "Good Performance";
			case "D" -> "Average Performance";
			case "P" -> "Pass";
			case "F" -> "Fail";
			default -> "Invalid Input";
		};
		System.out.println("Grade: "+ grade); 
		System.out.println("Result: "+ result);
		
	}
}
