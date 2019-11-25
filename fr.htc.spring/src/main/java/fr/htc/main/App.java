package fr.htc.main;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.htc.data.User;
import fr.htc.spring.CustomerService;

public class App {
	
	static Logger logger = Logger.getLogger(App.class);
	public static void main(String[] args) {
		logger.info("Starting Spring app...");
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "Spring-Customer.xml" });

		CustomerService customerService = (CustomerService) context.getBean("customerService");
		System.out.println(customerService);

		Integer id = 4000;
		User user = customerService.findUserByID(id);

		System.out.println(user);//*/

	}
}
