package javaday1prgms;

public class operators {
	public static void main(String[]args) {
		//Arithmetic Operator
		int s1=5;
		int s2=3;
		System.out.println(s1+s2);
		System.out.println(s1-s2);
	    System.out.println(s1*s2);
		System.out.println(s1/s2);
		System.out.println(s1%s2);
		
		//Relational Operator
		int a=100;
		int b=100;
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		
		//Logical Operator
		boolean t=true;
		boolean f=false;
		System.out.println(t&&f);
		System.out.println();
		
		//post increment
		int c=10;
		System.out.println(c);//10
		System.out.println(c++);//10
		System.out.println(c);//11
		
		//pre increment
		int d=10;
		System.out.println(d);//10
		System.out.println(++d);//10
        System.out.println(d);//9	
        
        //post drecement
        int e=10;
        System.out.println(e);//10
        System.out.println(e--);//10
        System.out.println(e);//9
        
        //pre drecement
		int g=10;
		System.out.println(g);//10
		System.out.println(--g);//9
		System.out.println(g);//9
		
        //Assignment Operator
        int h=100;
        System.out.println(h+=100);//200
        System.out.println(h-=100);//100
        System.out.println(h*=100);//10000
        System.out.println(h/=100);//100
        System.out.println(h%=100);//0
        
        //swap without temp variable
        System.out.println("a="+a+"/n"+"b="+b);
        System.out.println(a+=b);
        System.out.println(b=a-b);
        System.out.println(a=a-b);
        
        //Ternary Operator
        int age=18;
        String result=(age>=18)?"Eligable to vote":"Not eligable to vote";
        System.out.println(result);
        
        //Bitwise Operator
        int i=10;
        int j=20;
        System.out.println(i&j);
        System.out.println(i|j);
        System.out.println(i^j);
        System.out.println(~i);
        
        //Shift Operator
        //Left shift and Right shift
        System.out.println(i<<1);
        System.out.println(i>>1);
	}
}
