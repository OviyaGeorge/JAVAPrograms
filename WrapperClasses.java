package javaday2prgms;
import java.util.*;
public class WrapperClasses {
	public static void main(String[]args) {
		Integer myInt =  Integer.valueOf(100);
		Double myDouble = Double.valueOf(12.34);
		Character myChar = Character.valueOf('A');
		Boolean myBool = Boolean.valueOf(true);
		
		//Autoboxing: converting primitive-wrapper
		Integer intObj = 50;
		
		//Unboxing: converting wrapper-primitive
		int intValue = intObj;
		System.out.println(intValue);
	}
}
