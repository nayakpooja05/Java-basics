package javaoops;

public class EmployeeConstructor {
	
		 String empname;
		 int empid;
		 long empsalary;
		 String empdesig;

		 public static void main(String[] args) {
		  EmployeeConstructor emp1 = new EmployeeConstructor("pooja",1, 400000,"trainee");
		  emp1.display();
		  EmployeeConstructor emp2 = new EmployeeConstructor("anusha",2, 400000,"Trainee");
		  emp2.display();
		  EmployeeConstructor emp3 = new EmployeeConstructor("shreyank",3, 900000,"Associate");
		  emp3.display();


		 }
		 //Constructor
		 EmployeeConstructor(String empname_temp, int empid_temp, int empsalary_temp, String empdesig_temp) {
		  empname = empname_temp;
		  empid = empid_temp;
		  empsalary = empsalary_temp;
		  empdesig = empdesig_temp;
		 }
		 void display() {
		  System.out.println("Employee name : "+empname);
		  System.out.println("Employee ID : "+empid);
		  System.out.println("Employee salary : "+empsalary);
		  System.out.println("Employee designation : "+empdesig);
		  System.out.println();
		 }

	
	}


