package javaday4prgms;
import java.util.Scanner;

public class exception_ex1 {
	static void checkAge(int age) {
		if(age<18) {
			throw new IllegalArgumentException("Age must be 18 or older");
		}
		System.out.println("Access granted");
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number for dividend ");
		int dividend=s.nextInt();
		System.out.println("Enter the divisor");
		int divisor=s.nextInt();
//try catch finally
		try {
			int q=dividend/divisor;
			System.out.println("The Quotient is : "+q);
		}
		catch(ArithmeticException e){
			System.out.println("Cannot divide by zero : " + e.getMessage());
		}
		finally {
			System.out.println("Exception Completed");
		}
		try {

			checkAge(16);
		}
		catch(IllegalArgumentException e) {
			System.out.println("caught Exception: "+e.getMessage());
		}
}
}