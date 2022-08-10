package static_nonStatic;

public class Demo2 {
	int a= 10;
	static int b= 20;
	
	Demo2()
	{
		a = 30;
		b = 40;
	}
	
	Demo2 (int x)
	{
		a = 100;
		b = 200;
	}
	public static void main (String args [])
	{
		System.out.println("global, static b = "+b);
		
		System.out.println("");
		
	}
	

}
