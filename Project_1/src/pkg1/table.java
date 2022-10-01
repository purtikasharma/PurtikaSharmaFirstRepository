package pkg1;

import java.util.Scanner;
public class table {

	public void tableGenerate()
	{
		
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter number: ");  
		int num = sc.nextInt();
		for(int i=1; i<=10; i++)
		{
				int t = num*i;
			System.out.println(num+ " * " +i + " = " + t);
		}
	}
	public static void main(String[] args) {
		table obj = new table();
		obj.tableGenerate();
	}
}

