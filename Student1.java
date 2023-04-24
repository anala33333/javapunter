class Student1

{
	int stdid;
	double stdmarks;
	Student1(int a, double b)
	{
		stdid=a;
		stdmarks=b;
		return;
	}
	public static void main(String[] args) 
	{
		Student1 s=new Student1(101, 86.66);
        System.out.println(s.stdid);
		System.out.println(s.stdmarks);
	}
}
