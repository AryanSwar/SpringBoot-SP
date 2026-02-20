package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class StdConfigFile {
	
	@Bean
	public Student stdObj() {
		Student student = new Student();
		
		student.setName("Aryan");
		student.setRollno("2222");
		
		return student;
	}
}
