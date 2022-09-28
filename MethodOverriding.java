package javaoops;

class vehicle{
	void v1(){
		System.out.println("mode of transportations are: ");
	}
}
class land extends vehicle{
	 void v1() {
		 super.v1();
		 System.out.println("Air,Water,Land ");
	 }}
public class MethodOverriding extends land{
     void v1() {
    	 super.v1();
    	 System.out.println("Land includes railways,road and off-road");
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding obj= new MethodOverriding();
		obj.v1();
	}

}
