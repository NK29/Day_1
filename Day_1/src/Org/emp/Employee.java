package Org.emp;

public class Employee {
	
	public void Empid() {
		System.out.println("Employee ID: 6090");
	}
	public void EmpName() {
		System.out.println("Employee Name: Naveen");
	}
	public void EmpDob() {
		System.out.println("Employee Dob: 29/06/1996");
	}
	public void EmpPhone() {
		System.out.println("Employee Phone: 8892145850");
	}
	public void EmpEmail() {
		System.out.println("Employee Email: sknaveenkumar29@gmail.com");
	}
	public void EmpAddress() {
		System.out.println("Employee Address: Dommansandra");
	}
	
	public static void main(String[] args) {
		// ClassName ObjName = new ClassName();
		Employee employee = new Employee();
				employee.Empid();		
				employee.EmpName();
				employee.EmpDob();
				employee.EmpPhone();
				employee.EmpEmail();
				employee.EmpAddress();
	}

}
