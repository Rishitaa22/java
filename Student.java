package module2;

public class Student {
	String name;
	final int rollNumber=98;
	static int studentCount=0;
	Student(String name, int rollNumber){
		this.name=name;
		rollNumber=50;
		studentCount++;
	}
	public static void displayStudentCount() {
		System.out.println("Total number of students: " + studentCount);
	}
	public static void main(String[] args) {
		Student student1= new Student("Rishita", 63);
		Student student2= new Student("Krishna", 46);
		Student student3= new Student("Sreya", 70);
		displayStudentCount();
	}
}