package javaoops;

public class PolyMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PolyMulti obj=new PolyMulti();
		obj.multi1(45,20);
		obj.multi1(5.5f,6.5f );
		obj.multi1(20.5, 50.8,90.7);
	}
    void multi1(int x,int y) {
    	 int res=x*y;
    	 System.out.println("Result is:"+res);
     }
    void multi1(float x, float y) {
    	float res=x*y;
    	System.out.println("Result is:"+res);
    }
    void multi1(double x, double y,double z) {
    	double res=x*y*z;
    	System.out.println("Result is:"+res);
    }
	}


