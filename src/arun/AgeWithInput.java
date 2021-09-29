package arun;

import java.util.Scanner;

public class AgeWithInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your age in years"); 
		int ageInYears =input.nextInt();
		int ageInDays = ageInYears *365;
		System.out.println("You are about " + ageInDays + "days old");

	}

}
