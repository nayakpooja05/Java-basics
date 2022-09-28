package javaBasics;

public class NewClass {

	public static void main(String1[] args) {
		// TODO Auto-generated method stub
		float a=10.2f;
	       float b=20.2f;
	       float diff=b-a;
	       System.out.println("difference is " +diff);
	       double c=30.7886;
	       double d=40.5678;
	       double sum=c+d;
	       System.out.println("sum of two double is " +sum);
	       
	       int n1=5;
	       int n2=8;
	       int n3=3;

	       if (n1 >= n2 && n1 >= n3)
	     System.out.println("the largest number is " +n1);

	       
	       if (n2 >= n1 && n2 >= n3)
	      System.out.println("the largest number is " +n2);

	       
	       if (n3 >= n1 && n3 >= n2)
	       System.out.println("the largest number is " +n3);
	       
	       

	       int x,fact=1;
		   int n=6;

	       for(x=1;x<=n;x++)

	           fact=fact*x; 

	      System.out.println("Factorial of number is: " +fact);

	}

}
