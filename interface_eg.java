package practice;

interface abc
{
	void show();
}

class Implimentor implements abc
{
	public void show()
	{
		System.out.println("Anything..");
	}
}

public class interface_eg {

	public static void main(String[] args) {
		
		abc obj = new Implimentor();
		obj.show();

	}

}
