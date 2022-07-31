package opps;

public class BOAClass extends BankClass {
public int Credicardnumber ;

public void CCbalance() {
		System.out.println("Inside Account Balance");
		super.Accountnum=1234567890;
		this.Credicardnumber=1111111;
}
public void ClosedAccount(int Credicardnumber) {
			System.out.println("Inside BOA Credicardnumber");
		}
}


