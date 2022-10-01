package pkg1;

public class ParentConsClass {

	public ParentConsClass()
	{
		this(1);
		System.out.println("Parent default constructor");
	}
	
	public ParentConsClass(int a)
	{
		this(1,2,3);
		System.out.println("Parent 1 parameterized constructor");
	}
	
	public ParentConsClass(int a, int b)
	{
		this();
		System.out.println("Parent 2 parameterized constructor");
	}
	
	public ParentConsClass(int a, int b, int c)
	{
		
		System.out.println("Parent 3 parameterized constructor");
	}
	
	public static void main(String[] args) {
		//ParentConsClass ref = new ParentConsClass (1,2);
	}
}
