/*
 * Author: Rishita
 * Date: 08/08/25
 * Purpose: Class Exercise(1) on Inheritance
 * */
package sjcet;

class Book{
	String title;
	String author;
	double price;
	Book(String title, String author, double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public void displayDetails() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);
	}
}
class EBook extends Book {
	double fileSizeMB;
	EBook(String title, String author, double price, double fileSizeMB){
		super(title,author,price);
		this.fileSizeMB=fileSizeMB;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("File Size: " + fileSizeMB);
	}
}
class PrintedBook extends Book{
	int numberOfPages;
	PrintedBook(String title, String author, double price, int numberOfPages){
		super(title,author,price);
		this.numberOfPages=numberOfPages;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Number of pages: " + numberOfPages);
	}
}
public class InheritanceDemo {
	public static void main(String[] args) {
		EBook ebook = new EBook("Book1", "Krishna", 100.0, 20 );
		ebook.displayDetails();
		System.out.println();
		PrintedBook printedbook = new PrintedBook("Book2", "Rishita", 200.0, 50);
		printedbook.displayDetails();
	}
}