class Students

{
	int stdid;
	double stdmarks;
	Students(int a, double b)
	{
		stdid=a;
		stdmarks=b;
		return;
	}
	public static void main(String[] args) 
	{
		Students s=new Students(101, 86.66);
        System.out.println(s.stdid);
		System.out.println(s.stdmarks);
	}
}
