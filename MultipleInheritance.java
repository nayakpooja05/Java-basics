package javaoops;
interface abc12{
	void m1();
}

interface abc2{
	void m2();
	}

public class MultipleInheritance implements abc12,abc2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritance obj=new MultipleInheritance();
		obj.m1();
		obj.m2();
	}
	public void m1()
	{
		System.out.println("Hello world");
	}
	public void m2()
	{
		System.out.println("Welcome to java programming");
	}

	}


