package arun;

import java.util.Scanner;

public class Mad10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int requiredSalary = 30000;
int requiredYearsEmployed = 2;
System.out.println("Enter your salary");
Scanner scanner = new Scanner(System.in);
double salary = scanner.nextDouble();
System.out.println("Enter the number of years with your current employer");
double years = scanner.nextDouble();
scanner.close();
if(salary >= requiredSalary){
	if(years >= requiredYearsEmployed){
		System.out.println("Congrats! your are qulified for Loan");
	}
	else {
		System.out.println("Sorry, you must have work at your current job " 
	+ requiredYearsEmployed +  " years.");
		}
		
	}
      else {
		System.out.println("Sorry, you must earn at least $" 
      + requiredSalary + " to qualify for the loan");
	}
}
}


