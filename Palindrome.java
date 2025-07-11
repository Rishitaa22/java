/* 
 Author: Rishita
 Date: 11-07-2025
 Purpose: Java program to check whether the number is palindrome or not.
*/
package javafiles;

public class Palindrome {
	public static void main(String[] args) {
		int num=55555;
		int ogNum=num;
		int revNum= 0;
		while(num!=0) {
			int rem= num%10;
			revNum=revNum*10+rem;
			num=num/10;
		}
		if (ogNum==revNum) {
			System.out.println("Palindrome "); 
		}
		else {
			System.out.println("Not Palindrome");
		}
		
	}
}
