package pack1;

public class MultiExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]=new int[9];
     int x=9;
    
     try {
    	
    	 System.out.println(a[10]);
    	 int div=x/0;
    	 System.out.println(div);   
    	 }
     catch(ArithmeticException e) {
    	 System.out.println("Divide by zero error");
     }
     catch(ArrayIndexOutOfBoundsException e){
        System.out.println("index specified out of initialized memory");    	 
     }
	 catch(Exception e) {
		 System.out.println("exception class");
	 }
	}
	

}
