class Animal 
{
	void noise()
	{
		System.out.println("some noise....");
	}
}
class Dog extends Animal
{
	void noise()
	{
        System.out.println("dog noise");
	}
}
class Cat extends Animal
{
	void noise()
	{
        System.out.println("cat noise");
	}
}
class Snake extends Animal
{
	void noise()
	{
        System.out.println("snake noise");
	}
}
class Stimulator
{
	static void ansim(Animal a1)
	{
		a1.noise();
	}
}
class Mainclass2
{
    public static void main(String[] args) 
	{
		Dog d=new Dog();
		Cat c=new Cat();
		Snake s=new Snake();
		Stimulator.ansim(d);
		Stimulator.ansim(c);
		Stimulator.ansim(s);
	}
}
