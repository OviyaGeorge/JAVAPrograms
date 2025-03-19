package javaday3prgms;
import java.util.*;

class Book{
	int bookId;
	String title;
	String author;
	double price;
	Book(int bookId,String title,String author,double price) {
		this.bookId=bookId;
		this.title=title;
		this.author=author;
		this.price=price;
	}
  void displayDetails() {
	System.out.println("BookId:"+bookId);
	System.out.println("Title:"+title);
	System.out.println("Author:"+author);
	System.out.println("Price:"+price);
}
}
public class example_parameterized {
		public static void main(String[]args) {
			Book b1 = new Book(1,"The Jungle Book","Rudyard Kipling",15.2);
			Book b2 = new Book(2,"The Jungle Book","Rudyard Kipling",15.2);
			Book b3 = new Book(3,"The Jungle Book","Rudyard Kipling",15.2);
			b1.displayDetails();
			b2.displayDetails();
			b3.displayDetails();
}
}