package practice;

class p
{
	public void show()
	{
		System.out.println("Im show");
	}
}


public class anonymous {

	public static void main(String[] args) {
	
			p obj = new p()
						{
							public void show()
							{
								System.out.println("Im the  best");
							}
						};
			obj.show();
	}

}
