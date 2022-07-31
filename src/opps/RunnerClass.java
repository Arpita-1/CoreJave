package opps;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Class, Object, Construction
		EmployeeClass E1=new EmployeeClass();
		E1.EmpName="Arpita";
		E1.EmpId=1;
		E1.Department="IT";
		E1.Display();
		
		//System.out.println(E1.EmpName +" " +E1.EmpId+ " "+ E1.Department);
		//System.out.println(E1.EmpId);
		//System.out.println(E1.Department);
		EmployeeClass E2=new EmployeeClass("Test",2,"HR");
		E2.Display();
		
		//Inheritance Example
		
		BankClass B=new BankClass();
		B.AccountBalance();
		int Bal=B.GetBalance();
		System.out.println("The balance is:"+ Bal);
		
		BOAClass B1=new BOAClass();
		B1.CCbalance();
		B1.AccountBalance();
		
		//Polymorphism Example
		
		/* Overloading Example*/
		OverLoadingExample obj=new OverLoadingExample();
		int TringleArea=obj.GetArea(3,5);
		int RectangleArea=obj.GetArea(5);
		System.out.println("Tringle Area:"+TringleArea + " AND Reactngle Area:" + RectangleArea );
		
		/* Overriding Example*/
		B.ClosedAccount(123456);
		B1.ClosedAccount(98765);
		
		
		/* Abstract */
		
		Chrome ch=new Chrome();
		ch.openBrowser();
		Browser br=new Chrome();
		br.openBrowser();
		br.closeBrowser();
		br.DisplayName();
		
		/* Interface */
		 HondaCar car1=new HondaCar();
		 CARInterface car2=new HondaCar();
		 
		 /* Encapsulation*/
		 EncapsulationEx en=new EncapsulationEx();
		 en.setBalance(3000);
		 System.out.println(" Balance is :"+en.getBalance());
	}

}
 