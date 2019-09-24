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

		person.setTaxId(5342);
		System.out.println(person);
		
		Address address2 = (Address)applicationContext.getBean("address2");
		System.out.println(address2);

		((ClassPathXmlApplicationContext) applicationContext).close();
	}
}
