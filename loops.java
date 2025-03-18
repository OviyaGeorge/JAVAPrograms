package javaday1prgms;

public class loops {
public static void main(String[]args) {
	
	//for loop
	//Ascending order
	int n=10;
	for(int i=0;i<=n;i++) {
		System.out.println(i);
	}
	
	//Descending order
	for(int i=1;n>=i;n--) {
		System.out.println(n);
	}
	
	//odd number
	for(int i=1;i<=n;i++) {
	if(n%2!=0) {
		System.out.println(n);
	}
	}
	
	//while loop
	int j=0;
	while(j<n) {
		System.out.println(j);
		j++;
	}
	
	//do while loop
	int m=10;
	do {
		System.out.println(m);
		m++;
	}while(m<n);
	

    //array
    int []num=new int[5];
    num[0]=10;
    num[1]=20;
    num[2]=30;
    num[3]=40;
    num[4]=50;
    for (int i=0;i<num.length;i++)
    {
    	System.out.println(num[i]);
    }
}
}
