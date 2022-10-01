package pkg1;

import java.util.Scanner;

public class Armstrong {

	public void AmrstrongNumber()
	{
		int n, temp, sum=0, r;
		System.out.println("Enter n");
		Scanner obj1 = new Scanner(System.in);
		n = obj1.nextInt();
		temp=n;
		while(temp>0)
		{
			r=temp%10;
			sum = sum+(r*r*r);
			temp=temp/10;
		}
		if(n==sum)
			System.out.println(n+ "  is an armstrong");
		else
			System.out.println(n + " is not an armstrong");
		}
	public static void main(String[] args) {
		Armstrong obj = new Armstrong();
		obj.AmrstrongNumber();
	}
}


