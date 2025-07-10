package question1;

import java.util.Scanner;

public class Marks {
	public static void main (String[] args) {
		Scanner swan= new java.util.Scanner(System.in); 
		System.out.println("Enter your mark: ");
		int mark=swan.nextInt();
		if(mark>=90) {
			System.out.println("Grade A!");
		}
		else if(mark>=75) {
			System.out.println("Grade B!");
		}
		else {
			System.out.println("Grade C!");
		}
		
		swan.close();
	}
}
