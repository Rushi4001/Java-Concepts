package practice;

class K
{
	public void show()
	{
		System.out.println("in K");
	}
}

class T  extends K
{
	public void show()
	{
		System.out.println("in T");
	}
}

class S extends T
{
	public void show()
	{
		System.out.println("in S");
	}
}

public class dynamic_method_dispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		K obj = new T();  //runtime polymorphism
		obj.show();
		
		obj = new S();           //dynamic method dispatch
		obj.show();
		
	}

}
