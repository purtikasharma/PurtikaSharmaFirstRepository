package pkg1;

import java.util.Scanner;

public class Palindrome {

	int r,sum=0;
	int temp;
	public void palin()
	{
		System.out.println("Enter n");
		Scanner obj1 = new Scanner(System.in);
		int n = obj1.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
			System.out.println("Number is Palindrome");
		else
			System.out.println("Number is not Palindrome");		
	}
	
	public static void main(String[] args) {
		Palindrome obj = new Palindrome();
		obj.palin();
	}
}
