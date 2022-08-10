package static_nonStatic;

public class Demo1 {
	
	static int b = 49;    // global variable
	int a = 69;          //global variable
	
	Demo1()
	{
		b = 45;			//local var
	    a = 56;			//local var
		
	}

	public static void main(String args[]) {
		
		int z =122;     //local var
		System.out.println("Value of local var z is "+z);
		//System.out.println("Value of class variable a is "+Demo1.a)		//as variable is non static so cant access it as ClassName.variable name, for that we have to create obj then we can access it!
		Demo1 dm= new Demo1();
		System.out.println("Value of non static variable a is =69"+dm.a);
		
		System.out.println("Value of static b is "+b);
	//	System.out.println("Value of static a is "+a);
		
		
		Demo1 x = new Demo1 ();
		System.out.println("Value of non satatic b is "+b);
		System.out.println("Value of non static a is "+x.a);
	}
}

