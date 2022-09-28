package pack1;
class Private{
	private void p1() {
	
		System.out.println("hello world");
	}
}
class Default{
	void p2() {
		System.out.println("hello world");
	}
}
public class AccessModifiers {
	protected void p3() {
		System.out.println("hello world");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Private obj= new Private();
   obj.p1();//compile time error for private modifier
	}

}


