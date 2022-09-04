package pkg1;

public class Class_B {

	public void default_method()
	{
		System.out.println("Default Method");
	}

	public void one_method(int a)
	{	
		this.three_method(1,2,3);
		this.default_method();
		this.two_method(5, 10);
		this.four_method(5,10,15,2);
		System.out.println("One Parameterized Method");
		
	}

	public void two_method(int a, int b)
	{
		System.out.println("Two Parameterized Method");
	}
	

	public void three_method(int a, int b, int c)
	{
		System.out.println("Three Parameterized Method");
	}
	
	public void four_method(int a, int b, int c, int d)
	{
		System.out.println("Four Parameterized Method");
	}
	
	public static void main(String[] args) {
		Class_B object = new Class_B();
		object.one_method(1);
	}
}
