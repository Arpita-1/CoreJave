package test;

public class DataTypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=30;
		int num2=20;
		int sum=num1+num2;
		int multiplication= num1*num2;
		float div= (float) num1 / num2;
		
		String abc= "Clean world Green world" ;
		char ch1= abc.charAt(0);
		
		System.out.println("The sum of two number is :"+ sum);
		System.out.println("Multiplication of two number is :" + multiplication );
		System.out.println("Division of two number is :" + div);
        System.out.println(abc);
        System.out.println("First character is :" + ch1);
        System.out.println("The lenght of string is :" + abc.length());
        System.out.println("Last character of string is :" +abc.charAt( (abc.length()-1)));
        System.out.println("String upcase :" + abc.toUpperCase());
        System.out.println("String upcase :" + abc.toLowerCase());
	}

}
