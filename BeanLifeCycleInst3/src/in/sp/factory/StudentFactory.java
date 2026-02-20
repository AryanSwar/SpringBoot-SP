package in.sp.factory;

import in.sp.beans.Student;

public class StudentFactory {
	public Student createStdObj() {
		System.out.println("factory method invoked");
		
		Student std = new Student(19);
		return std;
	}
}
