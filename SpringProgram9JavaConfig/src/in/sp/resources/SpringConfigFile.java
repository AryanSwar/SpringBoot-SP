package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
	@Bean(name = "stdObj1")
	public Student createdBeanObj1() {
		Student student = new Student();
		
		student.setName("aryan");
		student.setRollno(1321);
		return student;
		
	}
	
	@Bean(name = "stdObj2")
	public Student createdBeanObj2() {
		Student student = new Student();
		
		student.setName("rahul");
		student.setRollno(2332);
		
		return student;
		
	}
}
