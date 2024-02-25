package Org.college;

public class College {
	
	public void collegeName() {
		System.out.println("College Name: ITI");
	}
	public void collegeCode() {
		System.out.println("College code: 560029");
	}
	public void collegeRank() {
		System.out.println("College Rank: SBI");
	}
	
	public static void main(String[] args) {
		//ClassaName ObjName = new ClassaName();
		College college = new College();
		college.collegeName();
		college.collegeCode();
		college.collegeRank();
		
		Student student = new Student();
		student.studentName();
		student.studentDept();
		student.studentId();
		
		Hostel hostel = new Hostel();
		hostel.hostelName();
		
		Dept deptname = new Dept();
		deptname.deptName();
	}

}
