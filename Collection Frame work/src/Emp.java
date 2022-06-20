import java.util.*;
public class Emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stu s1 =new Stu("Jhon","1001");
		Stu s2= new Stu("Mile","1002");
		Stu s3 =new Stu("julie","1003");
	
		List<Stu> ls = new ArrayList();
		ls.add(s1);ls.add(s2);ls.add(s3);
		for(Stu s:ls) {
			
			System.out.println("EmployeeName:"+s.EmployeeName);
			System.out.println("EMployeeId:"+s.EmployeeId);
		}

}}
