package Orgsystem;

public class Student extends Department {
	public void studentName()
	{
		System.out.println("StudentName");
	}
	
	public void studentDept()
	{
		System.out.println("StudentDept");
	}
	
	public void studentId()
	{
		System.out.println("StudentId");
	}
	public static void main(String[] args) {
		Student stu=new Student();
		stu.studentName();
		stu.studentId();
		stu.studentDept();
		stu.deptartmentName();
		stu.collegeCode();
		stu.collegeName();
		stu.collegeRank();
		
	}
}
