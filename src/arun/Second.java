package arun;

import java.util.Scanner;

public class Second {

	public int add() {
		int a,b,c;

		Scanner sc = new Scanner (System.in);

		System.out.println("enter your first number");
		a=sc.nextInt();
		System.out.println("enter your second number");


		b=sc.nextInt();
		c=a+b;
		System.out.println("Sum of "+a+" ,"+ b+" "+" "+"is" +" " +c);
		return c;
	

}
	public String multify(int a,int b,int c) {
		int x = a,y = b,z = c, d;
		d=x*y*z;
		System.out.println("result" + d);
		return "pass";
	}
	public String multify(int a,int b) {
		int x = a,y = b, d;
		d=x*y;
		System.out.println("result" + d);
		return "test pass";
	}
	
}