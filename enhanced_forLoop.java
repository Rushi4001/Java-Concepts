package practice;

public class enhanced_forLoop {
	
	public static void main(String arg[])
	{
		///////////////////////////////    1 d array    ////////////////////////////////////////
		int a[]= {1,2,3,4};
		
		for(int k :a)
		{
			System.out.println(k);
		}
	
		///////////////////////////////    2 d array   /////////////////////////////////////////
		int d[][]= {
						 {1,2,3},
						 {4,5,6},
						{6,7,8},
					};
		
		
		
		
		//enhanced loop
			for(int k[] : d)
			{
				for(int i : k)
				{
					System.out.print(i);
				}
				System.out.println();
			}
		}
		
		
	}

