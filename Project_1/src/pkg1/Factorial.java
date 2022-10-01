package pkg1;

import java.util.Scanner;

public class Factorial {

	public int fact(int a)
	{
		
		if(a==1)
		{
			return 1;
		}
		else
		{
			return (a*fact(a-1));
		}
	}
	public static void main(String[] args) {
		int facto =1;
		System.out.println("Enter n");
		Scanner obj1 = new Scanner(System.in);
		int n = obj1.nextInt();
		Factorial obj = new Factorial();
		facto = obj.fact(n);
		System.out.println("Factorial of "+n +" is " + facto);
	}
}
