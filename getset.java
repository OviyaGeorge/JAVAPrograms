package javaday3prgms;
import java.util.*;

class Data1 {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		} else {
			System.out.println("Invalid name!");
		}
	}
}
public class getset {
	public static void main(String[]args) {
		Data1 s1 = new Data1();
		s1.setName("Hardin");
		System.out.println("Student Name: "+s1.getName());
	}
}
