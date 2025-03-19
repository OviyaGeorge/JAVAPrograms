package javaday3prgms;
import java.util.*;
class Student{
	//Attribute
	String name;
	int rollnum;
	String dept;
	
	void displayData() {
		System.out.println("My Name is: "+name);
		System.out.println("Roll Number: "+rollnum);
		System.out.println("Department: "+dept);
	}
}
class Calculator{                //class name calculator
	int inp1,inp2,total;         //attribute inp1,inp2,total
	void add() {                 //method name add
		total = inp1 + inp2;
		System.out.println("Total:"+total);
	}
}
class Order {
	String name="mutton briyani";
	int quantity=2;
	int prize=635;
	
	void orderbill() {
		System.out.println("Bill for the order");
		System.out.println("Food:"+name);
		System.out.println("Quantity:"+quantity);
		System.out.println("Prize:"+prize);
	}
}
public class oops_clsobj {
	public static int add(int a, int b) {
		return a+b;
	}
	public static void main(String[]args) {
		Scanner s1  = new Scanner(System.in);
		System.out.println("Enter a values:");
		int inp1 = s1.nextInt();
		int inp2 = s1.nextInt();
		System.out.println(add(inp1,inp2));
		System.out.println(add(100,200));
		Student s = new Student();//Object
		s.name="Hardin";
		s.displayData();
		Calculator c = new Calculator();
		c.add();
		
		Order obj = new Order();
		obj.orderbill();
	}
}
