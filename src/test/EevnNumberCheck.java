package test;

import java.util.Scanner;

public class EevnNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner (System.in);
	
		System.out.println("Enter the Number: ");
		
		int num = scanner.nextInt();
		
		if(num%2==0) {
			
			System.out.println("Even Number");
		}else {
			
			System.out.println("Odd Number");
		}
		int num1;
		num1=32;
		System.out.println(num1%2);
		if (num1%2==0)
		{
		 System.out.println("Even number");
		}
		
		else
		{
			System.out.println("Odd Number");
		}
	

	}

}
