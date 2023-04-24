class Tester 
{
	void sum()
	{
		System.out.println(" i am the super class");
	}
}
class Demo extends Tester
{
	int n=13;
}
class Main
{
	public static void main(String[] args) 
	{
		Tester t=new Demo();
		t.sum();
		Demo d=(Demo)t;
		System.out.println(d.n);
		d.sum();

	}
}
