package com.example.demo;

import com.example.demo.oops.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setData("Shanchal", 22);
		s1.display();

		SpringApplication.run(DemoApplication.class, args);
	}
}
