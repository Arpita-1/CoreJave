package opps;

public class EmployeeClass {
	public String EmpName;
	public int EmpId;
	public String Department;
	
	public EmployeeClass() {
		
		System.out.println("Default Constructor");
	}
	
public EmployeeClass(String p1,int p2, String p3) {
		
		EmpName=p1;
		EmpId=p2;
		Department=p3;
	}
	
	public void Display()
	{
		System.out.println(EmpName+","+EmpId+","+Department);
	}

}
