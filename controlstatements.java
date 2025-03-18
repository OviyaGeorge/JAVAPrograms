package javaday1prgms;
import java.util.Scanner;
public class controlstatements {
public static void main(String[]args) {
	int a=10;
	int b=20;
	//if
	if(a==10) {
		System.out.println("A value is 10");
	}
	
	//if else
	if(a<b) {
		System.out.println("A lessthan B");
	}
	else {
		System.out.println("B lessthan A");
	}
	
	//nested if
	if(a<b) {
		if(a%2==0)
		{
			System.out.println(a+"Even number");
		}
	}
	
	//if else if
	int c=100;
	int d=200;
	int e=300;
	if(c>d && c>e) {
		System.out.println("C is greater");
	}
	else if(d>c && d>e) {
		System.out.println("D is greater");
	}
	else if(e>c && e>d) {
		System.out.println("E is greater");
	}
	else {
		System.out.println("All are equal");
	}
	
	//switch statement
	Scanner s1=new Scanner(System.in);
	int f=s1.nextInt();
	int g=s1.nextInt();
	char choice;
	System.out.println("+,-");
	choice=s1.next().charAt(0);
	switch(choice) {
	case '+':
		int h=f+g;
		System.out.println("ADD"+h);
	break;
	case '-':
		int i=f-g;
		System.out.println("SUB"+i);
	break;
	default:
		System.out.println("Invalid choice");
	break;	
	}
}
}

