package practice;


//////////////////////////////////      Inheritance   ////////////////////////////////////////////////////

class calculator                      //super class 
{
	public int add(int i, int j)
	{
		return i + j;
	}
}

class calc2 extends calculator      // sub class
{
	public int sub(int i , int j)
	{
		return i -j ;
	}
	
}

class calcAdv extends calc2
{
	public int mult(int i , int j)
	{
		return i * j;
	}
}


public class inheritance {
	public static void main(String arg[])
	{
		calcAdv result = new calcAdv();
		
		int result1=result.add(5,4);
		int result2=result.sub(5,4);
		int result3=result.mult(5, 4);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
	}
}
