abstract class demo
{
  abstract void some();
}
class Test extends demo
{
  void some()
  {
    System.out.println("Hello world");
  }
  public static void main(String [] args)
  {
	  Test t=new Test();
      t.some();
  }
}