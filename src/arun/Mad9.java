package arun;

import java.util.Scanner;

public class Mad9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quota = 10;
		System.out.println("Enter the number of sales");
		Scanner scanner =new Scanner(System.in);
		int sales = scanner.nextInt();
		scanner.close();
		
if(sales >= quota){
	System.out.println("Congrats");
}
  else {
	int salesShort =quota - sales;
	System.out.println("You did not make your quota, you were  " +  salesShort + " sales short");
}
	}

}
