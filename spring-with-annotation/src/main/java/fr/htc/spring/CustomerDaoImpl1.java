package fr.htc.spring;

import org.springframework.stereotype.Service;

@Service(value = "impl1")
public class CustomerDaoImpl1 implements CustomerDAO {

	@Override
	public String getName() {
		return "je suis l'impl�mentation N� 1";
	}


}
