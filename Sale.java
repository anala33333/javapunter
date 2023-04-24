class Sale
{
	int cost;
	static String cname="toy";
	String model;

	public static void main(String[] args) 
	{
		System.out.println("The item name is "+cname);
		Sale s1=new Sale();
		s1.cost=300;
        System.out.println("The cost of item is "+s1.cost);
		Sale s2=new Sale();
		s2.model="India";
		System.out.println("The model is "+s2.model);
	}
}

