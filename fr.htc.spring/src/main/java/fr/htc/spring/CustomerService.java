package fr.htc.spring;

import fr.htc.data.User;

public class CustomerService {
	CustomerDAO customerDAO;

	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	public User findUserByID(Integer id) {

		return customerDAO.getUserById(id);
	}

	@Override
	public String toString() {
		return "CustomerService [customerDAO=" + customerDAO + "]";
	}
}
