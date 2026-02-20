package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/in/sp/resources/applicationContext.xml");
		
		Student student1 = (Student) context.getBean("stdObj1");
		
		student1.display();
		
		System.out.println("----------------------------------------");
		
		Student student2 = (Student) context.getBean("stdObj2");
		
		student2.display();
		
	}
}
