package practice;

public class array_2d 
{
	
	public  static void main(String argv[])
	{
	
	int a[]= {1,2,3};
	int b[]= {4,5,6};
	int c[]= {6,7,8};
	
	int d[][]= {
					 {1,2,3},
					 {4,5,6},
					{6,7,8},
	};
	
	for(int i=0;i<d.length;i++)
	{
		for(int j=0 ;j< d[i].length ;j++)
		{
			System.out.print(d[i][j]);
		}
		System.out.println();
	}

	}
	
}
