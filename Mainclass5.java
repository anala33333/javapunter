class SBI
{
	private String pwd="Anu1234";
	public String getpwd()
	{
		return pwd;
	}
	public void setpwd(String pwd)
	{
		this.pwd=pwd;
	}
}
public class Mainclass5
{
	public static void main(String[] args) 
	{
		SBI s=new SBI();
		System.out.println(s.getpwd());
		s.setpwd("Anala1314");
		System.out.println(s.getpwd());
	}
}
