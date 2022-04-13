package practice;


	public class multi_Threading_lambdaExpression2 {

		public static void main(String[] args) throws Throwable {
			
			
			Thread t1 = new Thread(() ->
			{
				for(int i=0;i<5;i++)
				{
					System.out.println("Hii..");
					try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
				}
			},"hii Thread");       //object thread name
			
			
			Thread t2 = new Thread(() ->
			{
				for(int i=0;i<5;i++)
				{
					System.out.println("Hello..");
					try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
				}
			},"hello Thread");   //object thread name
			
			
			t1.setPriority(Thread.MIN_PRIORITY);
			t1.setPriority(Thread.MAX_PRIORITY);
			
			System.out.println(t1.getPriority());
			System.out.println(t2.getPriority());
			
			
			// get thread name
			System.out.println(t1.getName());
			System.out.println(t2.getName());
			
			//run code
			t1.start();
			t2.start();
			
			//join 
			t1.join();   // for joining two thread
			t2.join();   //without interupt of main thread
			
			System.out.println("Bye..");

		}

	}
