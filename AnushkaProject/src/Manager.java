 public class Manager extends Member {
	private String department;
	// parameterized Constructor
	public Manager(String name,int age,String phoneNumber, String address, double salary, String department) 
	{
		super(name,age,phoneNumber,address,salary);
		this.department = department;
	}
}