package pkg1;

import java.util.Scanner;

public class Swapwiththird {
	public void Swapping (int a, int b)
	{
		System.out.println("Before Swap Value of a"+ a);
		System.out.println("Before Swap Value of b"+ b);
		int temp;
		temp= a;
		a= b;
		b= temp;
		System.out.println("After Swap Value of a"+ a);
		System.out.println("After Swap Value of b"+ b);
		
	}
	public static void main(String[] args) {
		Swapwiththird obj = new Swapwiththird();
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter a");
		int a = obj1.nextInt();
		System.out.println("Enter b");
		int b = obj1.nextInt();
		obj.Swapping(a, b);
}
}