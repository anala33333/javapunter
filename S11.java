class S11 
{
	static void foo(int a)
	{
		a=a+2;
	}
	
	static void goo(int b, int c)
	{
		b=b+10;
		c=b*c;
	}
	System.out.println(a);

	public static void main(String[] args) 
	{
		foo(23);
		goo(12, 14);
	}
}
