package javaday3prgms;
import java.util.*;

class Bike{
	int count;
	String bikename;
	Bike(int count,String bikename){
		this.count=count;
		this.bikename=bikename;
	}
	void display() {
		System.out.println("The bike count is "+count);
		System.out.println("The bike name is"+bikename);
	}
}
    class Car{
	String brand;
	Car(){
		brand="unknown";
	}
	void display() {
		System.out.println("The brand name is "+brand);
	}
}
public class constructors {
	public static void main(String[]args) {
		Bike b1 = new Bike(2,"MT");
		b1.display();
		Car c1 = new Car();//default constructor
		c1.display();
	}
}
