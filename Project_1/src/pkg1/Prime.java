package pkg1;

import java.util.Scanner;

public class Prime {

	public void primeNumber(int num)
	{
		int i=2;
		boolean flag = false;
		while(i<=num/2)
		{
			if (num % i==0)
			{
				flag = true;
				break;

			}
			++i;
		}
		if(!flag)
			System.out.println(num + " is a prime number");
		else
			System.out.println(num + " is not a prime number");
	}
	
	public static void main(String[] args) {
		
	Prime obj = new Prime();
	System.out.println("Enter n");
	Scanner obj1 = new Scanner(System.in);
	int n = obj1.nextInt();
	obj.primeNumber(n);
	}
	
}

