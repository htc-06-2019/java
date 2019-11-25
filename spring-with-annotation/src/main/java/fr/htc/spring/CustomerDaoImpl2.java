package fr.htc.spring;

import org.springframework.stereotype.Service;

@Service(value = "impl2")
public class CustomerDaoImpl2 implements CustomerDAO {

	@Override
	public String getName() {
		return "je suis l'implémentation N° 2";
	}


}
