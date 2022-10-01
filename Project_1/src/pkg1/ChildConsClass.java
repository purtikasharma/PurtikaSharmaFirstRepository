package pkg1;

public class ChildConsClass extends ParentConsClass {

	public ChildConsClass()
	{
		this(1,2,2);
		System.out.println("Child default constructor");
	}
	
	public ChildConsClass(int a)
	{
		super(1,2);
		System.out.println("Child 1 parameterized constructor");
	}
	
	public ChildConsClass(int a, int b)
	{
		this();
		System.out.println("Child 2 parameterized constructor");
	}
	
	public ChildConsClass(int a, int b, int c)
	{
		this(1);
		System.out.println("Child 3 parameterized constructor");
	}
	
	public static void main(String[] args) {
		ChildConsClass ref = new ChildConsClass (1,2);
	}
}
