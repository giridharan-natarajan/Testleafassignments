package Orgsystem;

public class Departmentclass extends Studentclass {
public void  getStudentInfo(int id,String name ) {
	super.getStudentInfo(id, name);
	System.out.println("The id and name is "+ id+name);
}
}
