package javaoops;

public class StaticBlock {
	
	    int id;
	    String name;
	    int salary;
	    String desgn;
	    static String company="Evry";
	    static String collegeName;

	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        StaticBlock emp1= new StaticBlock();
	        
			emp1.init("Pooja",5000,"Trainee",13058);
			display1();
			emp1.display();
		
			StaticBlock emp2= new StaticBlock();
		    emp2.init("anusha",7000,"Trainee",13059);
		    display1();
		    emp2.display();

		    StaticBlock emp3= new StaticBlock();
	        emp3.init("shreyank",9000,"trainee",13057);
	        display1();
	        emp3.display();
	        
	    }
	    void init(String name_temp, int sal_temp, String desgn_temp,int id_temp) {
	    	  name=name_temp;
	    	  salary=sal_temp;
	    	  desgn=desgn_temp;
	    	  id= id_temp;
	      }
	    void display() {
	        
	    	 System.out.println("employee name: " +name);
	    	   System.out.println("employee salary: " +salary);
	    	   System.out.println("employee designation: " +desgn);
	    	   System.out.println("employee id: " +id);
	    	   System.out.println("employee company: " +company);
	    	   System.out.println("employee college: " +collegeName);
	    	   System.out.println();;
	    }
	    static void  display1(){
	        collegeName="MITE";
	        
	        
	    }
	    static {
	        System.out.println("Welcome to employee details");
	    }
	}
	
	


