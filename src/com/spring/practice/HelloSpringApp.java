package com.spring.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloSpring obj1 = (HelloSpring) context.getBean("helloSpring");
		obj1.setMessage("Hello Amzad!");
		String message1 = obj1.getMessage();
		System.out.println(message1);

		HelloSpring obj2 = (HelloSpring) context.getBean("helloSpring");
		String message2 = obj2.getMessage();
		System.out.println(message2);

	}

}
