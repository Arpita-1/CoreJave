package test;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {2,3,4};
		int i=10;
		try {
			
		System.out.println(array[2]);
		int res=i/0;
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Inside the catch block");
			
			}

		catch (ArithmeticException e){
			System.out.println("Inside the Arithmatic block");

	}
		finally {
			System.out.println("Inside Finally");
		}
		System.out.println("After Exception");

}
}