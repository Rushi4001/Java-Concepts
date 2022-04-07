package practice;

interface writer1
{
	 void write();	
}

class pen1 implements writer1
{
	public void write()
	{
		
		System.out.println("In a pen");
		
	}
	
}

class pencil1 implements writer1
{
	public void write()
	{
		System.out.println("In a pencil");
	}
	
	
}

class kit
{
	public void doSomething(pen p)
	{
		p.write();
	}
	
}

public class interface_in_java {
	
	public static void main(String argv[])
	{
		kit k =new kit();
		pen p = new pen();
		
		k.doSomething(p);
		
	}
	
	
	
}
