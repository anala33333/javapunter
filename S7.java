class S7 
{
	static void sub(int a)
	{
		a=10+a;
		System.out.println(a);
	}
	static void mul(int b)
	{
		b=b+2;
		System.out.println(b);
	}


	public static void main(String[] args) 
	{
		sub(12);
		mul(15);
	}
}
