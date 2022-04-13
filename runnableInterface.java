package practice;


	class hmm implements Runnable
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

	class ok implements Runnable
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

	public class runnableInterface {

		public static void main(String[] args) {
			
			Runnable obj1 = new hmm();
			Runnable obj2 = new ok();
			
			Thread t1 = new Thread(obj1);
			Thread t2 = new Thread(obj2);
			
			
			t1.start();
			t2.start();
			
//			obj1.show();
//			obj2.show();
		}

	}