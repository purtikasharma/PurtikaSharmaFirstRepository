package pkg1;

public class Arithmetic {


	public int sum(int a, int b) {
		
		int c;
		c =a+b;
		System.out.println("Sum result is "+c);
		return c;
	}
	

public int sub(int x, int y) {
		
		int z;
		z =x-y;
		System.out.println("Sub result is "+z);
		return z;
	}
	
public int mul(int a1, int a2)
        {
  	int a3;
  	a3 =a1*a2;
  	System.out.println("mul result is " +a3);
  	return a3;
        }
public int div(int b1, int b2)
{
	int b3;
	b3=b1/b2;
	System.out.println("div result is " +b3);
	return b3;
	
}

public static void main(String[] args) { // 
	Arithmetic ref = new Arithmetic();
	int sumResult =ref.sum(10,2);
	int sumResult1 = ref.sum(sumResult,2);
	int mulResult = ref.mul(sumResult1, 2);
	int subResult = ref.sub(mulResult, 2);
	int divResult =ref.div(subResult, 2);
	System.out.println("Final Result of ((((10+2)+2)*2)-2)/2) is "+divResult);
	
	
	int valuemul =ref.mul(10, 2);
	int valuesub = ref.sub(valuemul, 2);
	int valuesum = ref.sum(valuesub, 2);
	int valuesub2 = ref.sub(valuesum, 2);
	int valuediv = ref.div(valuesub2, 2);
	System.out.println("Final Result of (((10*2)-2)+2)-2)/2 is "+valuediv);
	
}
}
