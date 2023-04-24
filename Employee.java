class Employee 
{
	int empid;
	String ename;
	double empsal;
	Employee(int empid, String ename, double empsal)
	{
		this.empid=empid;
		this.ename=ename;
		this.empsal=empsal;
	}
	public static void main(String[] args) 
	{
		Employee e=new Employee(101, "Anala", 5666.66);
		System.out.println(e.empid);
		System.out.println(e.ename);
		System.out.println(e.empsal);
	}
}
