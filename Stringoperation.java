package javaday2prgms;
import java.util.Scanner;
public class Stringoperation {
	public static void main(String[]args) {
		String name = new String("Tessa");
		System.out.println(name);

	//getting name from user
	Scanner s1 = new Scanner(System.in);
	System.out.print("Enter a name:");
	String names=s1.nextLine();
	System.out.println(name);
	
	//length
	String str="Java";
	System.out.println(str.length());//4
	
	//substring
	String s="Java Programming";
	System.out.println(s.substring(3));//takes starting string
	System.out.println(s.substring(0,9));//takes start and end
	
	//string index of
	String s2="Java Programming";
	System.out.println(s2.indexOf("Prog"));//5 becz prog starts from 5th place
	System.out.println(s2.indexOf("x"));//0 becz there is no x value
	
	//toUpperCase and toLowerCase
	String s3="String Methods";
	System.out.println(s3.toUpperCase());
	System.out.println(s3.toLowerCase());
	
	//replace
	System.out.println(s.replace('a','A'));//JAvA ProgrAmming
	
	//equals
	String s4="JAVA";
	String s5="java";
	System.out.println(s4==s5);//false
	System.out.println(s4.equals(s5));//false
	System.out.println(s4.equalsIgnoreCase(s5));//true
	
	//charAt
	System.out.println(str.charAt(2));//v
	
	//split
	String s6="java,python,springBoot";
	String []language=s6.split(",");
	for (String s7 : language) {
		System.out.println(s7);
	}
		
	//concatenate
	String a="Java";
	String b="Programming";
	System.out.println("Concat String:"+ a.concat(b));
	
	//trim
	String c="Java";
	String c1=c.trim();
	System.out.println("Before Trim:"+c);
	System.out.println("After Trim:"+c1);
			
	//compareTo
	String d="java";
	String d1="javalab";
	System.out.println(d.compareTo(d1));//-3 becz d is smaller than d1
	
	//contains
	System.out.println(d1.contains("java"));//true
	System.out.println(d1.contains("Python"));//false
	
	//intern
	String a1 = new String("JavaDeveloper");
	String a2 = "JavaDeveloper";
	String a3 = a1.intern();
	System.out.println(a1==a2);//false
	System.out.println(a2==a3);//true

	//StringBuilderClass
	StringBuilder sb = new StringBuilder("Hello");
	   //Append
	   sb.append("World");
	   System.out.println("After append:" + sb);
	   //Insert
	   sb.insert(5,",");
	   System.out.println("After insert:" + sb);
	   //Replace
	   sb.replace(6,11,"Java");
	   System.out.println("After replace:" + sb);
	   //Reverse
	   sb.reverse();
	   System.out.println("After reverse:" + sb);
	  
    //StringBufferClass
	StringBuffer SB = new StringBuffer("Happy");
	   //Append
	   SB.append("World");
	   System.out.println("After append:" + SB);
	   //Insert
	   SB.insert(5,",");
	   System.out.println("After insert:" + SB);
	   //Replace
	   SB.replace(6,11,"Morning");
	   System.out.println("After replace:" + SB);
	   //Reverse
	   SB.reverse();
	   System.out.println("After reverse:" + SB);
}
}