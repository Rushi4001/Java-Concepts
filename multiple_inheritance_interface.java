package practice;

interface demo1
{
	void abc();
	default void show()
	{
		System.out.println("In show");
	}
}

interface mydemo 
{
	default void show()
	{
		System.out.println("In mydemo show");
	}
}

class demoImpl implements demo1, mydemo
{
	public void abc()
	{
		System.out.println("In abc");
	}
//	public void show()
//	{
//		System.out.println("In new show");
//	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		demo1.super.show();
	}
}

public class multiple_inheritance_interface {

	public static void main(String[] args) 
	{
		demo1 obj = new demoImpl();
		obj.abc();
		obj.show();
	}
}