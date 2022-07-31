package test;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "Clean World Green World";
		 String revstr="";
		 for(int i = str.length()-1; i >= 0; i--){    
			 revstr = revstr + str.charAt(i);    
	        }    
	            
	        System.out.println("Original string: " + str);    
	        //Displays the reverse of given string    
	        System.out.println("Reverse of given string: " + revstr);
	        
	        
	        //Reverse number
	        int number= 12345;
	        int revnumber=0;
	        int reminder=0;
	        
	        while(number>0) {
	        reminder=number%10;
	        revnumber=revnumber*10+reminder;
	        number=number/10;
	        }
	        System.out.println("The result is:"+revnumber);

	}

}
