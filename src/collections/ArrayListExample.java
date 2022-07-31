package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String[] Array1= {"abc","pqr","xyz"};*/
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("john");
		list1.add("liana");
		list1.add("Priyanka");
		list1.add("Rohan");
		list1.add("Elina");
		System.out.println("This is the List:"+ list1);
		System.out.println("Size of the List:"+ list1.size());
		
		list1.remove(1);
		list1.set(0,"Rahul");
		list1.add(1,"Leeana");
		System.out.println("This is the List:"+ list1);
		System.out.println("Size of the List:"+ list1.size());
		
		System.out.println("This is the List::"+ list1.get(3));
		
		Collections.sort(list1);
		System.out.println("This is the List:"+ list1);
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println("This is the List:"+ list1);
		
		for(int index=0; index<list1.size(); index++)
		{
			//System.out.println(list1.get(index));
			if(list1.get(index).equals("Priyanka")){
				System.out.println(index);
				break;
			}
					
		}
		
		/*for(String name:list1) {
			System.out.println(name);8/

		}
		
		//integer
		/*ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(100);
		list2.add(200);
		
		System.out.println("This is the List:"+ list2);
		System.out.println("Size of the List:"+ list2.size());*/

	}

}
