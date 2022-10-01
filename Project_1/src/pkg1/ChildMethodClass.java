package pkg1;

public class ChildMethodClass extends ParentMethodClass {

	public void ChildMethod1()
	{
		
		System.out.println("Child default method");
	}
	
	public void ChildMethod2(int a)
	{	super.ParentMethod3(1, 1);
		this.ChildMethod3(1,3);
		this.ChildMethod1();
		this.ChildMethod4(1,2,3);
		System.out.println("Child 1 parameter method");
	}
	
	public void ChildMethod3(int a, int b)
	{
		
	System.out.println("Child 2 parmaeterized  method");
	}
	
	public void ChildMethod4(int a, int b, int c)
	{
		
		System.out.println("Child 3 parmaeterized  method");
	}
	
	public static void main(String[] args) {
		ChildMethodClass ref = new ChildMethodClass ();
		ref.ChildMethod2(2);
}
}