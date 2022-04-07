package practice;

abstract class writer                               // abstract class 
{
	public  abstract void write();                 // declartion of abstract method 
}

class pen extends writer                            // concreate class 
{
	public void write()								//defination of abstract method 
	{
		System.out.println("Written by pen..");
	}
}

class pencil extends writer                               // concreate class 
{
	public void write()									//defination of abstract method 
	{
		System.out.println("Written by pencile..");
	}
}

public class abstract2_java {                               // main class

	public static void main(String[] args) {
		
		writer obj = new pen();
		obj.write();
		writer pc = new pencil();
		pc.write();
	}

}
