interface Nike
{
	void shoes();
} 
interface Puma extends Nike
{
	void bags();
}
public class Ecom implements Puma
{
	public void shoes()
	{
		System.out.println("Sports shoes............");
	}
	public void bags()
	{
		System.out.println("Casual bags.............");
	}
	public static void main(String[] args) 
	{
		Ecom e=new Ecom();
		e.shoes();
		e.bags();
	}
}
