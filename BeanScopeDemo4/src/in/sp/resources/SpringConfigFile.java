package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
	//scope is prototype
	@Bean
	@Scope("prototype")
	public Student stdObj() {
		Student student = new Student();
		
		return student;
		
	}
}
