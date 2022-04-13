package practice;

public class UserException {

	public static void main(String[] args) {
		
		int i =8;
		int j =9;
		
		try
		{
			int k = i/j;
			if(k ==0);
				throw new RushiFunction("This is not possible");
		}
			catch(RushiFunction e)
			{
				System.out.println("Erroe" + e.getMessage());
			}

	}

}
