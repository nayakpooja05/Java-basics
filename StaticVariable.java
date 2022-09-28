package javaoops;

public class StaticVariable {
	String name;
	int salary;
	String desgn;
	int id;
	static String company="Evry";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		StaticVariable emp1= new StaticVariable();
			emp1.init("Pooja",5000,"Trainee",13058);
			emp1.display();
		
			StaticVariable emp2= new StaticVariable();
		    emp2.init("anusha",7000,"Trainee",13059);
		    emp2.display();

		    StaticVariable emp3= new StaticVariable();
	     emp3.init("shreyank",9000,"trainee",13057);
	     emp3.display();
	}

	       void init(String name_temp, int sal_temp, String desgn_temp,int id_temp) {
	    	  name=name_temp;
	    	  salary=sal_temp;
	    	  desgn=desgn_temp;
	    	  id= id_temp;
	    	  
	      }
	       void display(){
	    	   System.out.println("employee name: " +name);
	    	   System.out.println("employee salary: " +salary);
	    	   System.out.println("employee designation: " +desgn);
	    	   System.out.println("employee id: " +id);
	    	   System.out.println("employee company: " +company);
	    	   System.out.println();
	       }
	
}
