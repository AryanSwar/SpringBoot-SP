package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Employee;

@Configuration
public class EmpConfigFile {
	
	@Bean
	public Employee empObj() {
		Employee employee = new Employee();
		
		employee.setEmpname("Kamal");
		employee.setEmpid(111); 
		
		return employee;
	}
}
