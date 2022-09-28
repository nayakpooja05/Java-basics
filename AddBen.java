package javaoops;
class Login{
			
				void login1() {
				  	  System.out.println("Login successfull");
				    }
		}

public class AddBen extends Login {
	void Addben1() {
		System.out.println("Add benificiaries");
		login1();
	}

//class Transfer extends AddBen{
	//

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      AddBen obj1= new AddBen();
      obj1.login1();
      AddBen obj2= new AddBen();
      obj2.Addben1();
     // AddBen obj3 = new AddBen();
      //obj3.trans();
	}
}


