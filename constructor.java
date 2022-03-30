
class calc
{
	 int num1;
     int num2;   //instance variable
	 
	calc()                 //default constructor
	{
		num1=5;
	}
	
	calc(int n)             // parametrised constructor
	{
		num1=n;
		num2=n;
	}
	public calc(double d,int n)
	{
		num1 = (int)d;
		num2=n;
	}
	
	
}

public class constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calc obj;                    //referrence
		obj = new calc(7.5,8);             //object creation
		
		System.out.println(obj.num1);
		System.out.println(obj.num2);
	}

}