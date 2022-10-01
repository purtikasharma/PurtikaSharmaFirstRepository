package pkg1;

import java.util.Scanner;

public class Swap {

	
	public void Swapping (int a, int b)
	{
		a= a+b;
		b= a-b;
		a=a-b;
		System.out.println("Swap Value of a"+ a);
		System.out.println("Swap Value of b"+ b);
	}

	public static void main(String[] args) {
		Swap obj = new Swap();
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter a");
		int a = obj1.nextInt();
		System.out.println("Enter b");
		int b = obj1.nextInt();
		obj.Swapping(a, b);
	}
}
