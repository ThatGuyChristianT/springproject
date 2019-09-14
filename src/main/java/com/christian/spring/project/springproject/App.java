package com.christian.spring.project.springproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/christian/spring/project/bean/beans.xml");

		Person person = (Person) applicationContext.getBean("person");
		Address address = (Address) applicationContext.getBean("address");
		System.out.println(person);
		System.out.println(address);
		((ClassPathXmlApplicationContext) applicationContext).close();
	}
}
