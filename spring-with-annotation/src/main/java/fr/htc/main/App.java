package fr.htc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.htc.spring.CustomerService;

public class App {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "Spring-AutoScan.xml" });

		CustomerService customerService = (CustomerService) context.getBean("customerService");
		System.out.println(customerService.getDaoName());
//*/

	}
}
