package pkg1;

public class Class_A {
	
	public Class_A ()
	{
		this(2,3,4);
		System.out.println("Default Constructor");
	}

	public Class_A (int a)
	{
		this();
		System.out.println("One parameterized Constructor");
	}

	public Class_A (int a, int b)
	{
		this(10);
		System.out.println("Two parameterized Constructor");
	}

	public Class_A (int a, int b , int c)
	{
		
		System.out.println("Three parameterized Constructor");
	}
	
	public Class_A (int a, int b , int c, int d)
	{
		this(1,2);
		System.out.println("Four parameterized Constructor");
	}

	public static void main(String[] args) {
		Class_A ref = new Class_A(1,2,3,4);
	}
}
