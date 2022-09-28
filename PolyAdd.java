package javaoops;



public class PolyAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		PolyAdd obj=new PolyAdd();
		obj.add1(45,20);
		obj.add1(5.5f,6.5f );
		obj.add1(20.5, 50.8,90.7);
	}
    void add1(int x,int y) {
    	 int res=x+y;
    	 System.out.println("Result is:"+res);
     }
    void add1(float x, float y) {
    	float res=x+y;
    	System.out.println("Result is:"+res);
    }
    void add1(double x, double y,double z) {
    	double res=x+y+z;
    	System.out.println("Result is:"+res);
    }
}



