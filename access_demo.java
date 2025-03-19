package javaday3prgms;
import java.util.*;

class Student1 {
	public String name="Hardin";
	private int age=20;
	protected String grade="A";
	String school="Canadian International School";
	
	public void displayInfo() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Grade: "+grade);
		System.out.println("School: "+school);
	}
}
public class access_demo {
	public static void main(String[]args) {
		Student1 s1 = new Student1();
		s1.displayInfo();
		
		System.out.println("Public Name: "+s1.name);
		System.out.println("Default School: "+s1.school);
	}
}
