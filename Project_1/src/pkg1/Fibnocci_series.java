package pkg1;

public class Fibnocci_series {

	int n1=0, n2=1, n3,i, count=10;
	//0 1 1 2 3 5 8 13 21 24
	public void Series ()
	{
		System.out.println(n1 +" "+n2);
		for(i=2;i<10;i++) {
		n3 = n1+n2;
		System.out.println(""+n3);
		n1=n2;
		n2=n3;
	}
	}
	public static void main(String[] args) {
		Fibnocci_series obj = new Fibnocci_series();
		obj.Series();
	}
}
