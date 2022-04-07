package practice;

interface demo
{
	void abc();
	default void show()
	{
		System.out.println("In show");
	}
}

class demoImp implements demo
{
	public void abc()
	{
		System.out.println("In abc");
	}
	public void show()
	{
		System.out.println("In new show");
	}
}

public class interface_default_definefunction {

	public static void main(String[] args) 
	{
		demo obj = new demoImp();
		obj.abc();
		obj.show();
	}
}
