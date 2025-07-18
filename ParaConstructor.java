/**
 * Author: Rishita
 * Date: 18/07/2025
 * Purpose: EXERCISE 2
 * */

package cseb;
import java.util.Scanner;

class Student {
	String name;
	int rollNumber;
	String department;
	
	Student(String name, int rollNumber, String department) {
		this.name= name;
		this.rollNumber= rollNumber;
		this.department= department;
	}


public void printStudentInfo() {
	System.out.println("Name:\t"+name);
	System.out.println("Roll Number:\t"+rollNumber);
	System.out.println("Department:\t"+department);
}
}
public class ParaConstructor {
	public static void main(String[] args) {
		String name;
		int rollNumber;
		String department;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name: ");
		name=sc.nextLine();
		System.out.println("Enter your roll number: ");
		rollNumber=sc.nextInt();
		System.out.println("Enter your department: ");
		department=sc.nextz();
		Student student= new Student(name,rollNumber,department);
		student.printStudentInfo();
	}
}



//Scanner scan= new Scanner(System.in);
//System.out.println("Enter your roll number:");
//int rollNUmber=scan.nextInt();