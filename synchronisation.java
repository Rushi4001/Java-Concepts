package practice;

class counter
{
	int count;
	public synchronized void increment()
	{
		count++;
	}
}

public class synchronisation {

	public static void main(String[] args) throws Exception {
		counter c = new counter();
		c.increment();
		c.increment();
		
		Thread t1 = new Thread(new Runnable()
		{
				public void run()
				{
					for(int i=1;i<=1000;i++)
					{
						c.increment();
		
					}
				}
		});
		
		
		Thread t2 = new Thread(new Runnable()
		{
				public void run()
				{
					for(int i=1;i<=1000;i++)
					{
						c.increment();
		
					}
				}
		});
		
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("count :" +c.count);

	}

}
