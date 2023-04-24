class Amazon1
{
	void sell()
	{
	System.out.println("Sells books");
	}
}
class Amazon2 extends Amazon1
{
	void sell()
	{
		System.out.println("Sells books and videos");
	}
}
class Mainclass
{
	public static void main(String[] args) 
	{
		Amazon2 a=new Amazon2();
		a.sell();
	}
}
