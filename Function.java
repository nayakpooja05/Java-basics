package javaBasics;

public class Function {

	public static void main(String1[] args) {
		// TODO Auto-generated method stub
		Function obj=new Function();
		obj.add();
		obj.sub();
		obj.product(5, 4);
		obj.division(40, 8);
		
		 
	}
		void add(){
			int x=10;
			int y=20;
		    int sum=x+y;
		    System.out.println("Sum of 2 numbers is " +sum);

	}
		void sub(){
			int a=10;
			int b=5;
			int diff=a-b;
			System.out.println("Diff of 2 numbers is " +diff);
		}
	int product(int w,int u) {
		int multi=w*u;
		System.out.println("The product of two numbers is " +multi);
		return multi;
	}
	int division(int p,int q) {
		int div=p/q;
		System.out.println("Division of two numbers is "+div);
		return div;
	}
	
	
}
