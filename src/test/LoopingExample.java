package test;

public class LoopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while loop;
		int num=0;
		
		while(num<=10 )
		{
			// continue, break
			/*if(num==6)
			{
				num=num+2;
			
			continue;
			}*/
			System.out.println(num);
			num= num+1;
		}
		//for loop;
		
		
 for (int i=0; i<=10; i++)
 {
	 if (i==6)
	 
	 {
		 continue;
	 }
	 
	 System.out.println(i);
 }
 
 System.out.println("After loop");
 
 int[] array1= {10,20,30,40,50};
 for(int num1 : array1) {
	 System.out.println(num1);
 }
 
 //reverse string
 // print array using only for loop.
 for(int index=0;index<array1.length;index++) {
		
		System.out.println(array1[index]);

 
	}
	}
}
