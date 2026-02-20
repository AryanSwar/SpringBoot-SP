package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.SpringConfigFile;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
//		context.refresh();
		
		Student student1 = (Student) context.getBean("stdObj1");
		
		student1.display();
		
		System.out.println("-------------------------------------------");
		
		Student student2 = (Student) context.getBean("stdObj2");
		
		student2.display();
	}
}
