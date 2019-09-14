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
		Person person2 = (Person) applicationContext.getBean("person");
		person2.setTaxId(5342);
		System.out.println(person2);
		((ClassPathXmlApplicationContext) applicationContext).close();
	}
}
