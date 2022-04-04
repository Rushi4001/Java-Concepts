package practice;

class O
{
	public void show()
	{
		
		System.out.println("in A");
	}
}

class P extends O
{
	public void show()
	{
		super.show();
		System.out.println("in B");
	}
	
}

public class method_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P obj = new P();
		obj.show();
		
	}

}
