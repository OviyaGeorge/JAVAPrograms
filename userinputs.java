package javaday1prgms;
import java.util.Scanner;
public class userinputs {
	public static void main(String[]args) {
	Scanner S1=new Scanner(System.in);
	System.out.println("Enter a Name:");
	String name=S1.nextLine();
	System.out.println("Enter your Age:");
	int age=S1.nextInt();
	System.out.println("Enter your marks:");
	int marks=S1.nextInt();
}
}