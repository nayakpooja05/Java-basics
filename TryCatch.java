package pack1;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try {
    	 int x=9;
    	 int y=0;
    	System.out.println(x/y);
     }
     catch(ArithmeticException e) {
    	 System.out.println("divide by zero exception");
     }
	}

}
