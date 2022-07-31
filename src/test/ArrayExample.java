package test;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array1= {10,20,30,40,50,60,70};
System.out.println("Total numbers are :" + array1.length);
System.out.println("The 2nd number of array is:" + array1[1]);
System.out.println("The last number of array is :" + array1[array1.length-1] );
String [] array2= {"abc","pqr","xyz"};
String str1="Clean world Green world" ;
String [] array3= str1.split(" ");
System.out.println("The first word of array3 is :"+ array3[0]);
System.out.println("The 2nd word of array2 is :"+ array2[1]);
System.out.println("The last word of array3 is :"+ array3[array3.length-1]);

	}

}
