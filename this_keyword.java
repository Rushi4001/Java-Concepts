
class calc
{
	int num1;
	int num2;
	int result;
	
	public calc(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
		
	}
	
}


class this_keyword
{
	
	public static void main(String argv[])
	{
		calc obj = new calc(4,5);
		
		System.out.println(obj.num1);
		System.out.println(obj.num2);
	}
}