package practice;

interface stv
{
	void show();
}

public class anonymous_with_interface {

	public static void main(String[] args) {
		
		stv obj = new stv()
		{
			public void show()
			{
				System.out.println("Im the  best");
			}
		};
obj.show();

	}

}
