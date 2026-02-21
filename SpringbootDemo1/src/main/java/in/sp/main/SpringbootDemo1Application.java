package in.sp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDemo1Application {

	public static void main(String[] args) {
		System.out.println("------------------Project Started----------------");
		SpringApplication.run(SpringbootDemo1Application.class, args);
		System.out.println("------------------Project Ended----------------");
	}

}
