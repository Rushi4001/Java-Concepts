
//method overloading

class casio
{
	/////////////////////////////////////////////////////////////////////////////////////////////////
	//                  Constructor overloading 
	/////////////////////////////////////////////////////////////////////////////////////////////
	int num1;
	int num2;
	String operation();
	
	
	public casio()
	{
		num1 = 0;
		num2 = 0;
		operation = "Nothing";
		
	}
	public casio(int i , int j)
	{
		num1 = i;
		num2 = 0;
		operation = "Nothing";
	}
	public casio(int i , int j , String a)
	{
		num1 = 0;
		num2 = 0;
		operation = a;
	}
	
	
}

public class  constructorOverLoading
{
	public static void main(String argv[])
	{
		casio obj = new casio(2 , 4 , "Add");
		
		
	}
	
}