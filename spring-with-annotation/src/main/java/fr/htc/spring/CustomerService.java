package fr.htc.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

	@Autowired
	@Qualifier("impl2")
	CustomerDAO customerDAO;
	// CustomerDAO dao2;

	@Override
	public String toString() {
		return "CustomerService [customerDAO=" + customerDAO.getName() + "]";
	}
	
	public String getDaoName() {
		
		return customerDAO.getName();
	}
}
