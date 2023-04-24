class Mainclass6 
{
	public static void main(String[] args) 
	{
		SBI s1=new SBI();
		Customer1.needMoney(s1);
		Customer2.needMoney(s1);
	}
}
class SBI
{
	void money()
	{
		System.out.println("10000 is credited");
	}
}
class Customer1
{
	static void needMoney(SBI s2)
	{
		s2.money();
	}
}
class Customer2
{
	static void needMoney(SBI s3)
	{
		s3.money();
	}

}