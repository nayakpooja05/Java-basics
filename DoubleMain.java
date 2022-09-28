package javaoops;

public class DoubleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main method");
		DoubleMain obj=new DoubleMain();
		obj.main();
		obj.main(5,2);
	}
		 void main(){
			int x=10;
			int y=20;
		    int sum=x+y;
		    System.out.println("Sum of 2 numbers is " +sum);

	}
		 void main(int x,int y){
				
			    int diff=x-y;
			    System.out.println("difference of 2 numbers is " +diff);

		}
	}


