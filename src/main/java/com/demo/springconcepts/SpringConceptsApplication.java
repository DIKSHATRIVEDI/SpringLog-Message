package com.demo.springconcepts;

import com.demo.springconcepts.components.DemoBean;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.demo.springconcepts.components")
public class SpringConceptsApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to spring concept demo.");
		ApplicationContext context=SpringApplication.run(SpringConceptsApplication.class, args);
		System.out.println("Checking Context : " + context.getBean(DemoBean.class));
	}

}
