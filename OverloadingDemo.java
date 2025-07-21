/*
 *AUTHOR: Rishita
 *DATE:21/07/2025
 *EXERCSE NUMBER 1
 *PURPOSE:Class called Calculator that contains Overloaded methods named add.
 */



package exercise;

class Calculator {
	public static void add(int a, int b) {
		int sum=a+b;
		System.out.println("Sum of two integer: "+sum);
	}
	public static void add(int a, int b ,int c) {
		int sum=a+b+c;
		System.out.println("Sum of three integers: "+sum);
	}
	public static void add(double a, double b) {
		double sum=a+b;
		System.out.println("Sum of two double values: "+sum);
	}
	public static void add(String a, int b) {
		String sum=a+b;
		System.out.println("Concatenation: "+sum);
	}
	
}
public class OverloadingDemo {
	public static void main(String[] args) {
		Calculator calculator= new Calculator();
		calculator.add(5.6, 4.4);
		calculator.add(5, 5);
		calculator.add(5, 8, 2);
		calculator.add("Hello user", 123);
	}
}
