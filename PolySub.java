package javaoops;

public class PolySub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PolySub obj=new PolySub();
		obj.sub1(45,20);
		obj.sub1(5.5f,6.5f );
		obj.sub1(20.5, 50.8,90.7);
	}
    void sub1(int x,int y) {
    	 int res=x-y;
    	 System.out.println("Result is:"+res);
     }
    void sub1(float x, float y) {
    	float res=x-y;
    	System.out.println("Result is:"+res);
    }
    void sub1(double x, double y,double z) {
    	double res=x-y-z;
    	System.out.println("Result is:"+res);
    }
	}


