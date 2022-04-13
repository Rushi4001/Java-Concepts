package practice;

class hii extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hii..");
			try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}

class hello extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello..");
			try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}

public class thread {

	public static void main(String[] args) {
		
		hii obj1 = new hii();
		hello obj2 = new hello();
		
		obj1.start();
		obj2.start();
		
//		obj1.show();
//		obj2.show();
	}

}
