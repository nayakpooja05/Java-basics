package javaoops;
interface abc1
{
	void m1();
}
public class Interface implements abc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface obj=new Interface();
		obj.m1();
	}
	public void m1()
	{
		System.out.println("Hello world");
	}
}



