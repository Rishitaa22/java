/*
 *AUTHOR: Rishita
 *DATE:21/07/2025
 *EXERCSE NUMBER 2
 *PURPOSE:Class called AreaCalculator that contains Overloaded methods named area.
 */
package exercise;

class AreaCalculator {
	public void area(double radius) {
		System.out.println("Area of circle: "+ 3.14*radius*radius);
	}
	public void area(double length, double width) {
		System.out.println("Area of rectangle: "+ length*width);
	}
	public void area(float base, float height) {
		System.out.println("Area of triangle: "+ 0.5f*base* height);
	}
	public void area(int side) {
		System.out.println("Area of square: "+ side*side);
	}

}
public class OverloadingDemo2 {

	public static void main(String[] args) {
		AreaCalculator calc= new AreaCalculator();
		calc.area(2.2);
		calc.area(5);
		calc.area(2.2, 5.3);
		calc.area(2.2f, 5.3f);
	}

}
