package pkg1;

public class ParentMethodClass {
	
	public void ParentMethod1()
	{
		
		System.out.println("Parent default method");
	}
	
	public void ParentMethod2(int a)
	{
		
		System.out.println("Parent 1 parameter method");
	}
	
	public void ParentMethod3(int a, int b)
	{
		this.ParentMethod1();
		this.ParentMethod4(1, 2, 3);
		this.ParentMethod2(1);
	System.out.println("Parent 2 parmaeterized  method");
	}
	
	public void ParentMethod4(int a, int b, int c)
	{
		
		System.out.println("Parent 3 parmaeterized  method");
	}
	
	public static void main(String[] args) {
		//ParentMethodClass ref = new ParentMethodClass ();
		//ref.ParentMethod3(1, 2);
	}

}
