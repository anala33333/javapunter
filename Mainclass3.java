class Whatsapp 
{
	void send(String txt)
	{
		System.out.println("Sending text messeges "+ txt);
	}
	void send(int no)
	{
		System.out.println("Sending numerics "+no);
	}
	void send(int no, String txt)
	{
		System.out.println("Sending text messeges along with numerics "+no+" "+txt);
	}
}
class Mainclass3
{
	public static void main(String[] args) 
	{
		Whatsapp w=new Whatsapp();
		w.send("Anala");
		w.send(14);
		w.send(14, "Anala");

	}
}
