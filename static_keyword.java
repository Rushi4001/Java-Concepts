

class emp
{
	int eid;
	int sallary;
	static String ceo;
	
	
	public void show()
	{
		System.out.println(eid +":"+sallary+":"+ceo);
	}

	
}

class static_keyword
{
	public static void main(String argv[])
	{
		emp rahul = new emp();
		rahul.eid=6;
		rahul.sallary=20000;
		emp.ceo="xyz";
		
		emp alok = new emp();
		alok.eid=8;
		alok.sallary=40000;
		emp.ceo="pratiksha";
		
		emp raj = new emp();
		raj.eid=15;
		raj.sallary=10000;
		emp.ceo="abc";
		
		rahul.show();
		alok.show();
		raj.show();
	}
	
}