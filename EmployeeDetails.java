package javaoops;

public class EmployeeDetails {
	String name;
	int salary;
	String desgn;
	int id;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails emp1= new EmployeeDetails();
		emp1.init("Pooja",5000,"Trainee",13058);
		emp1.display();
	
	     EmployeeDetails emp2= new EmployeeDetails();
	    emp2.init("anusha",7000,"Trainee",13059);
	    emp2.display();

     EmployeeDetails emp3= new EmployeeDetails();
    emp3.init("shreya",9000,"trainee",13057);
     emp3.display();}


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
    	   System.out.println();
       }
	}


