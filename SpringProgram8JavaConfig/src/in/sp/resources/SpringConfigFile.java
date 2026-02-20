package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
	@Bean(name = "stdObj1")
	public Student createdBeanObj() {
		Student student = new Student();
		
		return student;
		
	}
}
