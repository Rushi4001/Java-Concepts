package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class stud implements Comparable<stud>
{

	int rollno , marks;
	String name;
	
	public stud(int rollno, int marks, String name) {
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}

	@Override
	public String toString() {
		return "stud [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}
	
	public int compareTo(stud s)
	{
		return marks>s.marks?1:-1;
	}
	
}

public class comparable {

	public static void main(String[] args) {
		List<stud> studs = new ArrayList();
		
		studs.add(new stud(25,89,"rushi"));
		studs.add(new stud(23,79,"alok"));
		studs.add(new stud(7,59,"aditya"));
		studs.add(new stud(15,99,"sonal"));
		
		Collections.sort(studs);
		
		for(stud s : studs)
		{
			System.out.println(s);
		}
		
		
	}

}
