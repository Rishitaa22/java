/*
 * Author: Rishita
 * Date: 08/08/25
 * Purpose: Class Exercise(2) on Inheritance
 */
package sjcet;

class Vehicle {
	String brand;
	String model;
	Vehicle(String brand, String model){
		this.brand=brand;
		this.model=model;
	}
	public void displayInfo() {
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
	}
}
class Car extends Vehicle {
	String fuelType;
	Car(String brand, String model, String fuelType){
		super(brand,model);
		this.fuelType=fuelType;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Fuel Type: "+fuelType);
	}
}
class ElectricCar extends Car {
	double batteryCapacity;
	ElectricCar(String brand, String model, String fuelType, double batteryCapacity){
		super(brand,model,fuelType);
		this.batteryCapacity=batteryCapacity;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Battery Capacity: "+batteryCapacity);
	}
}
public class InheritanceDemo2 {
	public static void main(String[] args) {
		Car car = new Car("Porsche", "carrera", "petrol");
		car.displayInfo();
		System.out.println();
		ElectricCar electricCar = new ElectricCar("Krishna", "express", "Invalid", 500);
		electricCar.displayInfo();
	}
}
