package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
	//scope is singleton by default,written is optional 
	@Bean
	@Scope("singleton")
	public Student stdObj() {
		Student student = new Student();
		
		return student;
		
	}
}
