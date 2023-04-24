class Wtsapp 
{
	void send(int no)
	{
		System.out.println("The value of number is "+no);
	}
	void send(String name)
	{
		System.out.println("The Name is "+name);
	}
	void send(int no, String name)
	{
		System.out.println("The value of number is "+no+ " The Name is "+name);
	}
	void send(String name, int no)
	{
		System.out.println("The name is "+name+ " The value of number is "+no);
	}

	public static void main(String[] args) 
	{
		Wtsapp w=new Wtsapp();
        w.send(10);
		w.send("Anala");
		w.send(12, "Amigo");
		w.send("Adithi", 13);
	}
}
