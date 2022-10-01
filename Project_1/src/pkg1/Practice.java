package pkg1;

import java.util.Scanner;

public class Practice {

public int sum(int a, int b) {
		
		int c;
		c =a+b;
		return c;
	}

public int sub(int a, int b) {
	
	int c;
	c =a-b;
	return c;
}

public int mul(int a, int b) {
	
	int c;
	c =a*b;
	return c;
}

public int div(int a, int b) {
	
	int c;
	c =a/b;
	return c;
}
public static void main(String[] args) {
	
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter x1");
	int x1 = obj.nextInt();
	System.out.println("x1 value is " +x1);
	System.out.println("Enter x2");
	int x2 = obj.nextInt();
	System.out.println("x2 value is " +x2);
	System.out.println("Enter x3");
	int x3 = obj.nextInt();
	System.out.println("x3 value is " +x3);
	System.out.println("Enter x4");
	int x4 = obj.nextInt();
	System.out.println("x4 value is " +x4);
	System.out.println("Enter x5");
	int x5 = obj.nextInt();
	System.out.println("x5 value is " +x5);
	System.out.println("Enter x6");
	int x6 = obj.nextInt();
	System.out.println("x6 value is " +x6);
	Practice object = new Practice();
	int z = object.sum(x1,x2);
	int z1 = object.sum(z, x3);
	int z2 = object.sub(z1, x4);
	int z3 = object.mul(z2,x5);
	int Final_Result = object.div(z3,x6);
	System.out.println("Final Resut of (((((x1+x2)+x3)-x4)*x5)/x6):" + Final_Result);
	int q = object.mul(x1,x2);
	int q1 = object.sub(q, x3);
	int q2 = object.sub(q1, x4);
	int q3 = object.sum(q2, x5);
	int Final_Result1 = object.div(q3, x6);
	System.out.println("Final Result of (((((x1*x2)-x3)-x4)+x5)/x6)):" + Final_Result1);
	
}
}
