/* 
 Author: Rishita
 Date: 11-07-2025
 Purpose: Java program to print even numbers upto "n".
*/

package javafiles;

import java.util.Scanner;

public class EvenNum {
	public static void main(String[] args) {
		Scanner scan= new java.util.Scanner(System.in);
		System.out.println("Enter the limit: ");
		int limit=scan.nextInt();
		for (int i=2;i<=limit;i+=2) {
			System.out.print(i+"\n");		
		}
	}
}
