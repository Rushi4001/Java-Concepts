
//method overloading

class casio
{
	int num1;
	int num2;
	String operation();
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////
	//                                   Method overloading
	////////////////////////////////////////////////////////////////////////////////////////////////
	public void add(int i , int j)
	{
		System.out.println(i+j);
	}
	
	public void add(int i , int j , int k)
	{
		System.out.println(i+j+k);
	}
	
	public void add(double i , double j )
	{
		System.out.println(i+j);
	}
}

public class  MethodOverLoading
{
	public static void main(String argv[])
	{
		casio obj = new casio();
		obj.add(4,5);
		
		obj.add(3,4,5);
		
		obj.add(4.5,2.5);
		
	}
	
}