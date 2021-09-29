package arun;

import java.util.Scanner;

public class Mad8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int salary = 1000;
int bonus = 250;
int quota = 10;
System.out.println("How many sales did the the employee make this week?");
	Scanner scanner = new Scanner(System.in);	
	int sales = scanner.nextInt();
	scanner.close();
	
	if(sales >=quota) {
		salary = salary + bonus;
	}
	
	System.out.println("The employee's pay is $" + salary);
	}
	 
}
