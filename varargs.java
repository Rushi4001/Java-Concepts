package practice;

class calc
{
	public int add(int ... i)
	{
		int sum = 0;
		for(int k : i)
		{
			sum = sum+1;
		}
		return sum;
	}
}

public class varargs {
	public static void main(String arg[])
	{
		
		calc obj = new calc();
		System.out.println(obj.add(1,2,34,32));
		
		
	}

}
